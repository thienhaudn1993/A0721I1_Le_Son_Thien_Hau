import { Component, OnInit } from '@angular/core';
import {style} from '@angular/animations';
import {inspect} from 'util';


@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  backgroundColor: string;

  constructor() { }

  ngOnInit(): void {
  }

}
