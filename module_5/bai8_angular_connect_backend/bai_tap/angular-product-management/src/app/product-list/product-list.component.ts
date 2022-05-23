import { Component, OnInit } from '@angular/core';
import {ProductService} from '../service/product.service';
import {Product} from '../model/product';
import {FormControl, FormGroup} from '@angular/forms';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  searchForm: FormGroup;
  sortEd = true;
  private subscription: Subscription | undefined;
  x = 1;
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
   this.productService.getAll(this.x).subscribe(
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
    this.sortEd = !this.sortEd;
    this.productService.sortByPrice(this.sortEd).subscribe(
      (data) => {
        if (this.sortEd) {
          this.products = data;
        } else {
          this.products = data;
        }
      }
    );
  }

  previous() {
    this.x = this.x - 1;
    console.log(this.x);
    this.ngOnInit();
  }

  next() {
    this.x = this.x + 1;
    console.log(this.x);
    this.ngOnInit();
  }
}
