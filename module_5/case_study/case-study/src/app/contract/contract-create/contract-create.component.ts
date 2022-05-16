import { Component, OnInit } from '@angular/core';
import {ContractService} from '../../service/contract.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-contract-create',
  templateUrl: './contract-create.component.html',
  styleUrls: ['./contract-create.component.css']
})
export class ContractCreateComponent implements OnInit {
  createContractForm: FormGroup;
  constructor(private contractService: ContractService) { }

  ngOnInit(): void {
    this.createContractForm = new FormGroup({
      startDate: new FormControl(),
      endDate: new FormControl(),
      deposit: new FormControl(),
      total: new FormControl(),
      serviceId: new FormControl(),
    });
  }

}
