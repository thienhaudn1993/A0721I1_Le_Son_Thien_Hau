import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentDao} from '../dao/StudentDao';
import {StudentService} from '../service/student.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  studentForm: FormGroup;
  constructor(private studentServicer: StudentService, private router: Router) { }

  ngOnInit(): void {
    this.studentForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.max(100)]),
      name: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required]),
      mark: new FormControl('', [Validators.required]),
      avatar: new FormControl()
    });
  }
  get id(){
    return this.studentForm.get('id');
  }
  get name(){
    return this.studentForm.get('name');
  }
  get age(){
    return this.studentForm.get('age');
  }
  get mark(){
    return this.studentForm.get('mark');
  }
  createStudentForm() {
    console.log(this.studentForm.value);
    // StudentDao.studentDao.push(this.studentForm.value);
    this.studentServicer.addNewStudent(this.studentForm.value);
    this.router.navigateByUrl('');
  }
}
