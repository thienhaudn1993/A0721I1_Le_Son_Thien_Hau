import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  value: number;
  title = 'rating-bar';

  getDatafromChild(value1: number) {
    this.value = value1;
  }
}
