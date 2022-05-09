import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {IStudent} from '../model/IStudent';
import {StudentDao} from '../dao/StudentDao';

@Component({
  selector: 'app-template-form',
  templateUrl: './template-form.component.html',
  styleUrls: ['./template-form.component.css']
})
export class TemplateFormComponent implements OnInit {
  // student: IStudent[] = [];
  constructor() { }

  ngOnInit(): void {
  }

  createStudent(createStudentForm: NgForm) {
    console.log(createStudentForm.value);
    StudentDao.studentDao.push(createStudentForm.value);
  }
}
