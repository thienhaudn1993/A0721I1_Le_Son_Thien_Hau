import { Injectable } from '@angular/core';
import {IStudent} from './model/IStudent';
import {StudentDao} from './dao/StudentDao';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

const API_URL = 'http://localhost:3000/students';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {
  constructor(private http: HttpClient) { }
  // @ts-ignore
  getAllStudent(): Observable<IStudent[]> {
    return this.http.get<IStudent[]>(API_URL);
  }
  addNewStudent(student: IStudent): Observable<any> {
    // StudentDao.studentDao.push(student);
    return this.http.post(API_URL, student);
  }
  findStudentById(id: number): IStudent {
    // tslint:disable-next-line:triple-equals
    return StudentDao.studentDao.find((student) => student.id == id);
  }
  deleteById(id: number){
    return this.http.delete(API_URL + '/' + id);
  }
}
