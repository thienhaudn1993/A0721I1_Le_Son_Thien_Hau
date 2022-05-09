import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {ProductService} from '../service/product.service';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {gte} from '../gte.validator';
@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  formProduct = new FormGroup({
    id: new FormControl('', [Validators.required]),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl()
  });
  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {}

  get id(){
    return this.formProduct.get('id');
  }


  submit() {
    this.productService.saveProduct(this.formProduct.value);
    this.router.navigateByUrl('/product/list');
  }


}
