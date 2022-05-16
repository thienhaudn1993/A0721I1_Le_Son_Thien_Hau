import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Service} from '../model/service';
const URL_API = 'http://localhost:3000/services';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Service[]> {
    return this.httpClient.get<Service[]>(URL_API);
  }
  saveProduct(dichVu: Service): Observable<any> {
    console.log(dichVu);
    return this.httpClient.post(URL_API, dichVu);
  }
  findById(id: number): Observable<Service> {
    // @ts-ignore
    return this.httpClient.get(URL_API + '/' + id);
  }
  updateProduct(id: number, dichVu: Service): Observable<Service>{
    // @ts-ignore
    return this.httpClient.put(URL_API + '/' + id, dichVu);
  }
  deleteProduct(id: number) {
    return this.httpClient.delete(URL_API + '/' + id);
  }
}
