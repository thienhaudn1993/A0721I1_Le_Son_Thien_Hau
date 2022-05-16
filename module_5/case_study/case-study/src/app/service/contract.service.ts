import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Contract} from '../model/contract';
const URL_API = 'http://localhost:3000/contracts';
@Injectable({
  providedIn: 'root'
})
export class ContractService {

  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Contract[]> {
    return this.httpClient.get<Contract[]>(URL_API);
  }
  saveCustomer(contract: Contract): Observable<any> {
    // console.log(customer);
    return this.httpClient.post(URL_API, contract);
  }
}
