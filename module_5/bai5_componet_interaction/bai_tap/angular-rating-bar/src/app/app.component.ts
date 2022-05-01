import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  value: number;
  title = 'angular-rating-bar';

  getDataNew(value1: number) {
    this.value = value1;
  }
}
