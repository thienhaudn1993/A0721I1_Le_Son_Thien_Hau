import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {ServiceService} from '../../service/service.service';
import {Customer} from '../../model/customer';
import {Service} from '../../model/service';
import {FormControl, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customer: Customer;
  dichvuList: Service[];
  createCustomerForm: FormGroup;
  constructor(private customerService: CustomerService, private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.createCustomerForm = new FormGroup({
      name: new FormControl(),
      dateOfBirthday: new FormControl(),
      gender: new FormControl(),
      nationalId: new FormControl(),
      phone: new FormControl(),
      email: new FormControl(),
      customerType: new FormControl(),
      address: new FormControl(),
      serviceId: new FormControl(),
    });
    this.getAllService();
  }
  getAllService() {
    this.service.getAll().subscribe(
      (data) => {
        this.dichvuList = data;
      }
    );
  }

  createCustomer() {
    this.customerService.saveCustomer(this.createCustomerForm.value).subscribe(
      (data) => {
        alert('Create Customer Success');
        // console.log(data);
      },
      () => {},
      () => {
        this.router.navigateByUrl('/customer/list');
      }
    );
  }
}
