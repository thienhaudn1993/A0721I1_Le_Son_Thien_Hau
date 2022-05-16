import { Component, OnInit } from '@angular/core';
import {ServiceService} from '../../service/service.service';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Service} from '../../model/service';

@Component({
  selector: 'app-chinh-sua-dich-vu',
  templateUrl: './chinh-sua-dich-vu.component.html',
  styleUrls: ['./chinh-sua-dich-vu.component.css']
})
export class ChinhSuaDichVuComponent implements OnInit {
  editForm: FormGroup;
  id: number;
  dichVu: Service;
  constructor(private service: ServiceService, private activatedRouter: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      this.service.findById(this.id).subscribe(
        (data) => {
          this.editForm = new FormGroup({
            // id: new FormControl(),
            tenDichVu: new FormControl(data.tenDichVu),
            dienTich: new FormControl(data.dienTich),
            loaiDichVu: new FormControl(data.loaiDichVu),
            chiPhiThue: new FormControl(data.chiPhiThue),
            soLuongNguoiToiDa: new FormControl(data.soLuongNguoiToiDa),
            kieuThue: new FormControl(data.kieuThue),
            tieuChuanPhong: new FormControl(data.tieuChuanPhong),
            moTaTienNghiKhac: new FormControl(data.moTaTienNghiKhac),
            dienTichHoBoi: new FormControl(data.dienTichHoBoi),
            soTang: new FormControl(data.soTang),
            dichVuMienPhiKemTheo: new FormControl(data.dichVuMienPhiKemTheo),
            tenDichVuDiKem: new FormControl(data.tenDichVuDiKem),
            donVi: new FormControl(data.donVi),
            giaTien: new FormControl(data.giaTien),
            src: new FormControl(data.src)
          });
        }
      );
    });
  }

  editService(id: number) {
    this.service.updateProduct(id, this.editForm.value).subscribe(
      () => {
        alert('Update Success');
      },
      () => {},
      () => {
        this.router.navigateByUrl('/service/list');
      },
    );
  }
}
