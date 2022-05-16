import {Component, OnChanges, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {Customer} from '../../model/customer';
import {ServiceService} from '../../service/service.service';
import {Service} from '../../model/service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit, OnChanges {
  customers: Customer[];
  constructor(private customerService: CustomerService, private service: ServiceService) { }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(
      (data) => {
        this.customers = data;
      }
    );
  }

  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe(
      () => {},
      () => {},
      () => {
        this.ngOnInit();
        // this.ngOnChanges();
        // Cách 2 trong trường hợp dùng modal bị fade backgroud ko nhấn gì được
      }
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
