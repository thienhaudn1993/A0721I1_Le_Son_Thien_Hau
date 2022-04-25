import { Component, OnInit } from '@angular/core';
import {parse} from 'ts-node';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  result: any;

  constructor() { }
  ngOnInit(): void {
  }

  addition(a, b) {
    this.result = parseFloat(a) + parseFloat(b);
  }
  subtraction(a, b) {
    this.result =  parseFloat(a) - parseFloat(b);
  }
  multiplication(a, b) {
    this.result =  parseFloat(a) * parseFloat(b);
  }
  division(a, b) {
    // tslint:disable-next-line:triple-equals
    if (b != 0) {
      this.result = parseFloat(a) / parseFloat(b);
    } else {
      this.result = 'Phép tính vô nghĩa';
    }
  }

}
