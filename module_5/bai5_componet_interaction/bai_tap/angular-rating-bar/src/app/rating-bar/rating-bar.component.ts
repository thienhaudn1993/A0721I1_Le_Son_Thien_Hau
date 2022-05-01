import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {IRatingUnit} from '../model/IRatingUnit';
import {IRatingUnitDao} from '../IRatingUnitDao';

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  @Output()
  ratingEvent = new EventEmitter<number>();
  rating: IRatingUnit[] = IRatingUnitDao.rating;
  constructor() { }

  ngOnInit(): void {
  }

  getData(value: number) {
    this.ratingEvent.emit(value);
    for (let i = 0;  i < value; i++){
      this.rating[i].action = 1;
    }
  }
}
