import { Injectable } from '@angular/core';
import {IStudent} from './model/IStudent';
import {StudentDao} from './dao/StudentDao';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {

  constructor() { }
  addNewStudent(student: IStudent) {
    StudentDao.studentDao.push(student);
  }
  findStudentById(id: number): IStudent {
    // tslint:disable-next-line:triple-equals
    return StudentDao.studentDao.find((student) => student.id == id);
  }
}
