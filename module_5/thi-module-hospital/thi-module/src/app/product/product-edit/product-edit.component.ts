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
            ma_benh_an: new FormControl(product.ma_benh_an, [Validators.required, ]),
            ma_benh_nhan: new FormControl(product.ma_benh_nhan, [Validators.required]),
            ten_bn: new FormControl(product.ten_bn, [Validators.required, Validators.pattern(/^[a-zA-Z ]+$/)]),
            ngay_nv: new FormControl(product.ngay_nv, [Validators.required]),
            ngay_rv: new FormControl(product.ngay_rv, [Validators.required]),
            ly_do_nv: new FormControl(product.ly_do_nv, [Validators.required]),
            phuong_phap: new FormControl(product.phuong_phap, [Validators.required]),
            bac_si_dieu_tri: new FormControl(product.bac_si_dieu_tri, [Validators.required]),
          });
        }
      );
    });
  }
  get ma_benh_an(){
    return this.formEdit.get('ma_benh_an');
  }
  get ma_benh_nhan(){
    return this.formEdit.get('ma_benh_nhan');
  }
  get ten_bn(){
    return this.formEdit.get('ten_bn');
  }
  get ngay_nv(){
    return this.formEdit.get('ngay_nv');
  }
  get ngay_rv(){
    return this.formEdit.get('ngay_rv');
  }
  get ly_do_nv(){
    return this.formEdit.get('ly_do_nv');
  }
  get phuong_phap(){
    return this.formEdit.get('phuong_phap');
  }
  get bac_si_dieu_tri(){
    return this.formEdit.get('bac_si_dieu_tri');
  }
  editForm(id: number) {
    this.productService.update(id, this.formEdit.value).subscribe(
      () => {
        alert('Chỉnh sửa thông tin thành công');
      },
    () => {},
    () => {
      this.router.navigateByUrl('products/list');
    }
    );
  }

  back() {
    this.router.navigateByUrl('products/list');
  }
}
