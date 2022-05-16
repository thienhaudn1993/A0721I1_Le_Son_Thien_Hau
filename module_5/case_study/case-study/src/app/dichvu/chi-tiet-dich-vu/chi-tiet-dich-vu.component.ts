import { Component, OnInit } from '@angular/core';
import {ServiceService} from '../../service/service.service';
import {ActivatedRoute} from '@angular/router';
import {Service} from '../../model/service';

@Component({
  selector: 'app-chi-tiet-dich-vu',
  templateUrl: './chi-tiet-dich-vu.component.html',
  styleUrls: ['./chi-tiet-dich-vu.component.css']
})
export class ChiTietDichVuComponent implements OnInit {
  dichVu: Service;
  id: number;
  constructor(private service: ServiceService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      this.service.findById(this.id).subscribe(
        (dichVu) => {
          this.dichVu = dichVu;
        }
      );
    });
  }

}
