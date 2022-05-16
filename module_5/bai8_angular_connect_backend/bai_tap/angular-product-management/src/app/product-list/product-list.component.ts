import { Component, OnInit } from '@angular/core';
import {ProductService} from '../service/product.service';
import {Product} from '../model/product';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  searchForm: FormGroup;
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
   this.productService.getAll().subscribe(
     (data) => {
       this.products = data;
     }
   );
   this.searchForm = new FormGroup({
     nameS: new FormControl()
   });
  }
  // getAllList() {
  //   this.products = this.productService.getAll();
  // }
  search() {
    this.productService.searchByName(this.searchForm.value.nameS).subscribe(
      (data) => {
        this.products = data;
        console.log(this.searchForm.value.nameS);
      },
    () => {},
    () => {},
    );
  }

  searchS(value: string) {
    console.log(value);
    this.productService.searchByName(value).subscribe(
      (data) => {
        this.products = data;
        console.log(data);
      }
    );
  }

  sort() {
    this.productService.sortByPrice().subscribe(
      (data) => {
        this.products = data;
        // @ts-ignore
        // this.products = ! this.products;
      }
    );
  }
}
