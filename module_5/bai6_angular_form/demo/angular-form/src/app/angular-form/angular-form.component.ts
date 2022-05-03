import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-angular-form',
  templateUrl: './angular-form.component.html',
  styleUrls: ['./angular-form.component.css']
})
export class AngularFormComponent implements OnInit {
  student = {
    studentCode: 'SV-01',
    studentName: 'Hau Le',
    studentAddress: 'DN'
  };
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(createStudentForm: NgForm) {
    // console.log(createStudentForm.value);
    console.log(this.student);
  }
}
