import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentDao} from '../dao/StudentDao';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  // Tạo pt lấy danh sách bỏ qua HTML
  students: IStudent[] = StudentDao.studentDao;
  // Cách 2: ngClass
  cssStringvar = 'colorBlue sizeFont textAlign';
  studentDetail: IStudent;
  constructor() { }

  ngOnInit(): void {
  }

  getStudentDetail(student: IStudent) {
    this.studentDetail = student;
  }
  getData(data: any){
    console.log(data);
  }
}
