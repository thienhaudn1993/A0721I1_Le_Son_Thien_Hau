import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  contactForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
  });

  constructor() { }

  ngOnInit(): void {
  }
  get email(){
    return this.contactForm.get('email');
  }
  get password(){
    return this.contactForm.get('password');
  }

  onSubmit() {
    console.log(this.contactForm.value);
  }
}
