import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  createForm: FormGroup;
  constructor(private productService: ProductService, private router: Router) { }

  ngOnInit(): void {
    this.createForm = new FormGroup({
      // id: new FormControl(),
      name: new FormControl('', [Validators.required]),
      price: new FormControl('', [Validators.required, Validators.min(1)]),
      status: new FormControl('', [Validators.required]),
      description: new FormControl('', [Validators.required, Validators.minLength(10)]),
      quantity: new FormControl('', [Validators.required, Validators.min(0)])
    });
  }
  get name(){
    return this.createForm.get('name');
  }
  get price(){
    return this.createForm.get('price');
  }
  get status(){
    return this.createForm.get('status');
  }
  get description(){
    return this.createForm.get('description');
  }
  get quantity(){
    return this.createForm.get('quantity');
  }

  createProduct() {
    this.productService.save(this.createForm.value).subscribe(
      () => {
        alert(' Thêm mới thành công');
      },
      () => {},
      () => {
        this.router.navigateByUrl('products/list');
      }
    );
  }
}
