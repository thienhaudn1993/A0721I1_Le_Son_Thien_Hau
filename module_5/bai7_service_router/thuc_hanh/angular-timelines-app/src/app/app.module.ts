import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TimelinesComponent } from './timelines/timelines.component';
import {DateUtilService} from './service/date-util.service';

@NgModule({
  declarations: [
    AppComponent,
    TimelinesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [DateUtilService],
  bootstrap: [AppComponent]
})
export class AppModule { }
