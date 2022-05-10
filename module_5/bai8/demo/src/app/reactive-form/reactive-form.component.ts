import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentDao} from '../dao/StudentDao';
import {StudentServiceService} from '../student-service.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  studentForm: FormGroup;

  constructor(private studentService: StudentServiceService, private router: Router) {
  }

  ngOnInit(): void {
    this.studentForm = new FormGroup({
      id: new FormControl(),
      name: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required]),
      mark: new FormControl('', [Validators.required]),
      avatar: new FormControl()
    });
  }

  get id() {
    return this.studentForm.get('id');
  }

  get name() {
    return this.studentForm.get('name');
  }

  get age() {
    return this.studentForm.get('age');
  }

  get mark() {
    return this.studentForm.get('mark');
  }

  createStudentForm() {
    console.log(this.studentForm.value);
    this.studentService.addNewStudent(this.studentForm.value).subscribe();
    // StudentDao.studentDao.push(this.studentForm.value); -- Sai nghiệp vụ  }
    this.router.navigateByUrl('');
    // để chuyển về trang chủ
  }
}
