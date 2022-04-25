import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  num1: number = 0;
  num2: number = 0;
  result: any;
  constructor() { }

  ngOnInit(): void {
  }
  addition() {
    this.result = this.num1 + this.num2;
  }
  subtraction() {
    this.result = this.num1 - this.num2;
  }
  multiplication() {
    this.result = this.num1 * this.num2;
  }
  division() {
    // tslint:disable-next-line:triple-equals
    if (this.num2 != 0) {
      this.result = this.num1 / this.num2;
    } else {
      this.result = 'Phép tính vô nghĩa khi mẫu số bằng 0';
    }
  }

}
