import { Component, OnInit } from '@angular/core';
import {ProductService} from '../service/product.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Product} from '../model/product';
import {FormControl, FormGroup} from '@angular/forms';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  id: number;
  product: Product;
  productFormEdit: FormGroup;
  constructor(private productService: ProductService, private activatedRouter: ActivatedRoute, private router: Router) { }
  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      // dấu + để hiểu id là number
      this.id = +param.get('id');
      // this.getProduct(this.id);
      // @ts-ignore
      this.product = this.productService.findById(this.id).subscribe(
        (product) => {
          console.log(product);
          this.productFormEdit = new FormGroup({
            id: new FormControl(product.id),
            name: new FormControl(product.name),
            price: new FormControl(product.price),
            description: new FormControl(product.description)
          });
        }
      );
    });
   /* this.productFormEdit = new FormGroup({
      id: new FormControl(this.product.id),
      name: new FormControl(this.product.name),
      price: new FormControl(this.product.price),
      description: new FormControl(this.product.description)
    });*/
  }
  /*getProduct(id: number) {
    return this.productService.findById(id).subscribe(
      (product) => {
        this.product = product;
      }
    );
  }*/
  editForm(id: number) {
    // console.log('success');
    this.productService.updateProduct(id, this.productFormEdit.value).subscribe();
    console.log(this.productFormEdit.value);
    alert('Cập nhâp thành công');
    this.router.navigateByUrl('/product/list');
  }
}
