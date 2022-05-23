import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
const URL_API = 'http://localhost:8080/api/customers';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(URL_API);
}
}
