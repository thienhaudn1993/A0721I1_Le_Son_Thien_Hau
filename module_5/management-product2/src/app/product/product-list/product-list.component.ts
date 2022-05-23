import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  checkSort = true;
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getAll().subscribe(
      (data) => {
        this.products = data;
      }
    );
  }

  deleteProduct(id: number) {
    this.productService.delete(id).subscribe(
      () => {},
      () => {},
      () => {
        this.ngOnInit();
      }
    );
  }


  search(value: string) {
    this.productService.searchName(value).subscribe(
      (data) => {
        this.products = data;
      }
    );
  }

  sortByPrice() {
    this.checkSort = ! this.checkSort;
    this.productService.sort(this.checkSort).subscribe(
      (data) => {
        this.products = data;
      }
    );
  }
}
