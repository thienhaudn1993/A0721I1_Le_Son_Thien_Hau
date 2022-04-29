import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit, DoCheck {
  @Input()
  student: IStudent | undefined;
  @Output()
  evenSendData: EventEmitter<string> = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  sendData(){
    this.evenSendData.emit('Hello A0721I1');
  }

  ngDoCheck(): void {
    console.log('docheck');
  }

}
