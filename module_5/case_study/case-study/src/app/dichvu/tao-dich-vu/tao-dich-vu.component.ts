import { Component, OnInit } from '@angular/core';
import {ServiceService} from '../../service/service.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';
import {Service} from '../../model/service';

@Component({
  selector: 'app-tao-dich-vu',
  templateUrl: './tao-dich-vu.component.html',
  styleUrls: ['./tao-dich-vu.component.css']
})
export class TaoDichVuComponent implements OnInit {
  createForm: FormGroup;
  constructor(private service: ServiceService, private router: Router) { }
  ngOnInit(): void {
    this.createForm = new FormGroup({
      // id: new FormControl(),
      tenDichVu: new FormControl(),
      dienTich: new FormControl(),
      loaiDichVu: new FormControl(),
      chiPhiThue: new FormControl(),
      soLuongNguoiToiDa: new FormControl(),
      kieuThue: new FormControl(),
      tieuChuanPhong: new FormControl(),
      moTaTienNghiKhac: new FormControl(),
      dienTichHoBoi: new FormControl(),
      soTang: new FormControl(),
      dichVuMienPhiKemTheo: new FormControl(),
      tenDichVuDiKem: new FormControl(),
      donVi: new FormControl(),
      giaTien: new FormControl(),
      src: new FormControl()
    });
  }
  createService() {
    console.log(this.createForm.value);
    this.service.saveProduct(this.createForm.value).subscribe(
      (data) => {
        // console.log(data);
        alert('Tạo dịch vụ thành công');
      },
      () => {
        // console.log(this.createForm.value);
      },
      () => {
        this.router.navigateByUrl('/service/list');
      }
    );
  }
}
