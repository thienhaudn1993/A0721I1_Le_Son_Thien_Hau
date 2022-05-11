import { Component, OnInit } from '@angular/core';
import {ProductService} from '../service/product.service';
import {ActivatedRoute, Router} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';
import {Product} from '../model/product';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  productFormDelete: FormGroup;
  id: number;
  product: Product;
  constructor(private productService: ProductService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      // dấu + để hiểu id là number
      this.id = +param.get('id');
      // @ts-ignore
      this.product = this.productService.findById(this.id).subscribe(
        (product) => {
          this.productFormDelete = new FormGroup({
            id: new FormControl(product.id),
            name: new FormControl(product.name),
            price: new FormControl(product.price),
            description: new FormControl(product.description)
          });
        }
      );
    });
  }
  delete(id: number) {
    // tslint:disable-next-line:no-unused-expression
    // this.productService.deleteProduct(id);
    // alert('Xoá thành công ' + this.product.name);
    // this.router.navigateByUrl('/product/list');
    this.productService.deleteProduct(id).subscribe(
      () => {},
      () => {},
      () => {
        this.router.navigateByUrl('/product/list');
      },
    );
  }
}
