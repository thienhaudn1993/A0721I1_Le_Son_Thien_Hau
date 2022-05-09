import {AbstractControl, ValidationErrors} from '@angular/forms';
import {ProductService} from './service/product.service';
// @ts-ignore
export function  gte(control: AbstractControl): ValidationErrors | null {
  // tslint:disable-next-line:label-position no-unused-expression prefer-const
  let productService: ProductService;
  const v = control.value;
  // tslint:disable-next-line:prefer-for-of
  for (let i = 0; i < productService.products.length ; i++) {
    if (v === productService.products[i].id) {
      return {gte : true, requiredValue : 'Id exist' };
    }
  }
  return null;
}
