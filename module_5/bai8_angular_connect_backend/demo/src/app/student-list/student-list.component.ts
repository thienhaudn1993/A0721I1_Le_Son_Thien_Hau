import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentDao} from '../dao/StudentDao';
import {StudentServiceService} from '../student-service.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  // Tạo pt lấy danh sách bỏ qua HTML
  // students: IStudent[] = StudentDao.studentDao;
  students: IStudent[] | undefined;
  // Cách 2: ngClass
  cssStringvar = 'colorBlue sizeFont textAlign';
  studentDetail: IStudent;
  constructor(private studentService: StudentServiceService) { }

  ngOnInit(): void {
    this.studentService.getAllStudent().subscribe(
      (data) => {
        this.students = data;
      },
      () => {},
      () => {}
    );
  }

  getStudentDetail(student: IStudent) {
    this.studentDetail = student;
  }
  getData(data: any){
    console.log(data);
  }

  deleteStudent(id: number) {
    this.studentService.deleteById(id).subscribe();
    // sau khi xoá xong tự gọi lại ngOnInit để nó tự động có lại dự liệu mới mà ko cần load lại
    this.ngOnInit();
  }
}
