import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
const URL_API = 'http://localhost:3000/customers';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(URL_API);
  }
  saveCustomer(customer: Customer): Observable<any> {
    // console.log(customer);
    return this.httpClient.post(URL_API, customer);
  }
  findById(id: number): Observable<Customer> {
    // @ts-ignore
    return this.httpClient.get(URL_API + '/' + id);
  }
  updateCustomer(id: number, customer: Customer): Observable<Customer>{
    // @ts-ignore
    return this.httpClient.put(URL_API + '/' + id, customer);
  }
  deleteCustomer(id: number) {
    return this.httpClient.delete(URL_API + '/' + id);
  }
}
