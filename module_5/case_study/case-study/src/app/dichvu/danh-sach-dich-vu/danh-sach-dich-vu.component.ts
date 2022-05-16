import {Component, OnChanges, OnInit} from '@angular/core';
import {ServiceService} from '../../service/service.service';
import {Service} from '../../model/service';

@Component({
  selector: 'app-danh-sach-dich-vu',
  templateUrl: './danh-sach-dich-vu.component.html',
  styleUrls: ['./danh-sach-dich-vu.component.css']
})
export class DanhSachDichVuComponent implements OnInit, OnChanges {
  mangDichVu: Service[] = [];
  constructor(private service: ServiceService) { }

  ngOnInit(): void {
    this.service.getAll().subscribe(
      (dichvu) => {
        this.mangDichVu = dichvu;
      },
      () => {},
      () => {}
    );
  }

  deleteService(id: number) {
    this.service.deleteProduct(id).subscribe(
      () => {
        // alert('Delete Success');
      },
      () => {},
      () => {
        this.ngOnInit();
        // this.ngOnChanges();
        // Cách 2 trong trường hợp dùng modal bị fade backgroud ko nhấn gì được
      },
    );
  }

  ngOnChanges(): void {
    // tslint:disable-next-line:prefer-const
    let modalDelete = document.querySelectorAll('.modal-backdrop');
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0 ; i < modalDelete.length ; i++) {
      console.log(modalDelete);
      modalDelete[i].classList.add('d-none');
      modalDelete[i].classList.remove('show');
    }
  }
}
