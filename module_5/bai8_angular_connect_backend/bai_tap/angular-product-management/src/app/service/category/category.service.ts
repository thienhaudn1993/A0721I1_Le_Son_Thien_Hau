import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../../model/category';
import {Product} from '../../model/product';
const URL_API = 'http://localhost:3000/categories';
@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient: HttpClient) { }
  getAllCategory(): Observable<Category[]> {
    // @ts-ignore
    return this.httpClient.get(URL_API);
  }
  createCategory(category: Category): Observable<any> {
    return this.httpClient.post(URL_API, category);
  }
  findCatogoryById(id: number): Observable<Category> {
    return this.httpClient.get(URL_API + '/' + id);
  }
  deleteCategory(id: number) {
    return this.httpClient.delete(URL_API + '/' + id);
  }
  editCategory(id: number, category: Category): Observable<Category> {
    return this.httpClient.put(URL_API + '/' + id, category);
  }
}
