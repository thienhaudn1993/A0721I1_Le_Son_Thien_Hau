import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {ProductService} from '../service/product.service';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {CategoryService} from '../service/category/category.service';
import {Category} from '../model/category';
@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  constructor(private productService: ProductService, private router: Router, private categoryService: CategoryService) { }
  formProduct = new FormGroup({
    // id: new FormControl('', [Validators.required]),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });
  categories: Category[] = [];

  ngOnInit(): void {
    // console.log(this.productService.getAll());
    this.getAllCategory();
  }
  get id(){
    return this.formProduct.get('id');
  }

  submit() {
    this.productService.saveProduct(this.formProduct.value).subscribe();
    alert('Tạo thành công');
    this.router.navigateByUrl('/product/list');
  }
  getAllCategory(){
    this.categoryService.getAllCategory().subscribe(
      (categories) => {
        this.categories = categories;
      }
    );
  }

  //  gte(control: AbstractControl): ValidationErrors  {
  //   // tslint:disable-next-line:label-position no-unused-expression prefer-const
  //   // let productService: ProductService;
  //   const v = control.value;
  //   console.log(v);
  //   // tslint:disable-next-line:prefer-for-of
  //     // tslint:disable-next-line:prefer-for-of
  //   console.log(this._productService.getAll());
  //   for (let i = 0; i < this._productService.products.length ; i++) {
  //       if (v === this._productService.products[i].id) {
  //         return {gte : true, requiredValue : 'Id exist' };
  //       }
  //     }
  // }
}
