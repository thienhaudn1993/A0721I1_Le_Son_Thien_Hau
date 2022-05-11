import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Todo} from '../todo';
const URL_API = 'http://localhost:3000/todos';
@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private httpClient: HttpClient) { }
  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(URL_API);
  }
  createTodo(todo: Todo): Observable<any> {
    return this.httpClient.post(URL_API, todo);
  }
  deleteTodo(id: number): Observable<Todo> {
    return this.httpClient.delete(URL_API + '/' + id);
  }
  findTodoById(id: number): Observable<Todo> {
    return this.httpClient.get(URL_API + '/' + id);
  }
  editTodo(id: number, todo: Todo): Observable<Todo> {
    return this.httpClient.put(URL_API + '/' + id, todo);
  }
}
