import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentServiceService} from '../student-service.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit, DoCheck {
  // Khai báo biến nhận dữ liệu variable_received
  student: IStudent | undefined;
  constructor( private studentService: StudentServiceService, private activatedRouter: ActivatedRoute) { }

  ngOnInit(): void {
    // let id = 0;
    this.activatedRouter.paramMap.subscribe((param) => {
      this.student =  this.studentService.findStudentById(Number(param.get('id')));
    });
  }


  ngDoCheck(): void {
    console.log('docheck');
  }

}
