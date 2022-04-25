import { Component, OnInit } from '@angular/core';
import {IStudent} from './IStudent';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name: 'Hau Le',
    age: 29,
    mark: 9,
    avatar: 'https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_.jpg'
  };
  constructor() { }

  ngOnInit(): void {
  }

}
