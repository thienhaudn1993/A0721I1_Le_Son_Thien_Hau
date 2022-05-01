import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {IRatingUnit} from '../model/IRatingUnit';
import {RatingUnitDao} from '../dao/RatingUnitDao';

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  @Output()
  ratingEvent = new EventEmitter<number>();
  rating: IRatingUnit[] = RatingUnitDao.rating;


  constructor() { }

  ngOnInit(): void {
  }

  getValue(value: number) {
    this.ratingEvent.emit(value);
    for (let i = 0; i < value; i++) {
      this.rating[i].action = 1;
    }
    // vòng lặp for dưới này để từ value vừa chọn đến các giá trí lớn hơn sau nó sẽ ko đổi qua màu vàng
    for (let i = value; i < 10; i++) {
      this.rating[i].action = 0;
    }
    // this.rating[value - 1].action = 1;
  }
}
