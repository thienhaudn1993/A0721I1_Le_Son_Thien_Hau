import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit, DoCheck {
  // Khai báo biến nhận dữ liệu variable_received
  @Input()
  student: IStudent | undefined;
  @Output()
  evenSendData: EventEmitter<string> = new EventEmitter();
  // student: IStudent = {
  //   id: 1,
  //   name: 'Hau Le',
  //   age: 29,
  //   mark: 9,
  //   avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
  // };
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
