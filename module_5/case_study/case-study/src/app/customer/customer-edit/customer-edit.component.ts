import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Customer} from '../../model/customer';
import {ActivatedRoute, Router} from '@angular/router';
import {Service} from '../../model/service';
import {ServiceService} from '../../service/service.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  editCustomerForm: FormGroup;
  customer: Customer;
  id: number;
  dichVuList: Service[];
  constructor(private customerService: CustomerService, private activatedRouter: ActivatedRoute, private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      this.customerService.findById(this.id).subscribe(
        (data) => {
          this.editCustomerForm = new FormGroup({
            name: new FormControl(data.name),
            dateOfBirthday: new FormControl(data.dateOfBirthday),
            gender: new FormControl(data.gender),
            nationalId: new FormControl(data.nationalId),
            phone: new FormControl(data.phone),
            email: new FormControl(data.email),
            customerType: new FormControl(data.customerType),
            address: new FormControl(data.address),
            serviceId: new FormControl(data.serviceId),
          });
        }
      );
    });
    this.getAllService();
  }
  getAllService() {
    this.service.getAll().subscribe(
      (data) => {
        this.dichVuList = data;
      }
    );
  }

  editCustomer(id: number) {
    this.customerService.updateCustomer(id, this.editCustomerForm.value).subscribe(
      () => {
        alert('Update Customer Success');
      },
      () => {},
      () => {
        this.router.navigateByUrl('/customer/list');
      }
    );
  }
}
