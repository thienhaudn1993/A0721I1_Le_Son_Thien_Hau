import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit {
  @Input()
  seconds = 10;
  @Output()
  finish = new EventEmitter<boolean>();
  remainingTime: number;
  private intervalId = 0;
  message = '';


  constructor() { }
  clearTimer(){
    clearInterval(this.intervalId);
  }
  ngOnInit(): void {
    this.reset();
  }
  private countDown(){
    // this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.clearTimer();
        this.finish.emit(true);
      }
    }, 1000);
  }
  start() {
    this.message = '';
    // this.message = '' để ẩn chữ Click start button to start the Countdown khi vừa nhấn vào start
    this.countDown();
    if (this.remainingTime <= 0){
      this.remainingTime = this.seconds;
    }
  }

  stop() {
    this.clearTimer();
    this.message = `Holding at T-${this.remainingTime} seconds`;
  }

  reset() {
    this.clearTimer();
    this.remainingTime = this.seconds;
    this.message = 'Click start button to start the Countdown';
    this.finish.emit(false);
    // this.finish.emit(false): mục đích là sau khi reset lại thì dữ liệu cha sẽ restart lại để ko còn giữ chữ Hello Countdown
  }
}
