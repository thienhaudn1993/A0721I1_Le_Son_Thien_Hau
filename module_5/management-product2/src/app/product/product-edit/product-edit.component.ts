import { Component, OnInit } from '@angular/core';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  formEdit: FormGroup;
  id: number;
  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      this.productService.findById(this.id).subscribe(
        (product) => {
          this.formEdit = new FormGroup({
            name: new FormControl(product.name, [Validators.required]),
            price: new FormControl(product.price, [Validators.required, Validators.min(1)]),
            status: new FormControl(product.status, [Validators.required]),
            description: new FormControl(product.description, [Validators.required, Validators.minLength(10)]),
            quantity: new FormControl(product.quantity, [Validators.required, Validators.min(0)])
          });
        }
      );
    });
  }
  get name(){
    return this.formEdit.get('name');
  }
  get price(){
    return this.formEdit.get('price');
  }
  get status(){
    return this.formEdit.get('status');
  }
  get description(){
    return this.formEdit.get('description');
  }
  get quantity(){
    return this.formEdit.get('quantity');
  }

  editProduct(id: number) {
    this.productService.update(id, this.formEdit.value).subscribe(
      () => {
        alert('Updata thành công');
      },
      () => {},
      () => {
        this.router.navigateByUrl('products/list');
      }
    );
  }
}
