import { Component, OnInit } from '@angular/core';
import {ProductService} from '../service/product.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  formProduct = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl()
  });
  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {
  }


  submit() {
    this.productService.saveProduct(this.formProduct.value);
    this.router.navigateByUrl('/product/list');
  }
}
