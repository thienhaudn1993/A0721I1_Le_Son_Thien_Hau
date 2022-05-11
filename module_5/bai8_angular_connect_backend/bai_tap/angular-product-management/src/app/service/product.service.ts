import { Injectable } from '@angular/core';
import {Product} from '../model/product';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
const URL_API = 'http://localhost:3000/products';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[]  | undefined;
  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(URL_API);
  }
  saveProduct(product: Product): Observable<any> {
    return this.httpClient.post(URL_API, product);
  }
  // @ts-ignore
 /* findById(id: number): Product {
    return this.products.find((product) => product.id === id);
  }*/
  findById(id: number): Observable<Product> {
    return this.httpClient.get(URL_API + '/' + id);
  }
  /*updateProduct(id: number, product: Product){
    // tslint:disable-next-line:prefer-for-of
   for (let i = 0; i < this.products.length; i++){
     if (this.products[i].id === id) {
       this.products[i] = product;
     }
   }
  }*/
  updateProduct(id: number, product: Product): Observable<Product>{
    return this.httpClient.put(URL_API + '/' + id, product);
  }
  // deleteProduct(id: number){
  //   for (let i = 0; i <= this.products.length; i++) {
  //     if (this.products[i].id === id) {
  //       this.pr
  //     }
  //   }
  // }
  deleteProduct(id: number) {
    return this.httpClient.delete(URL_API + '/' + id);
  }
  /*deleteProduct(id: number) {
    this.products = this.products.filter(product => {
      return product.id !== id;
    });
  }*/
}
