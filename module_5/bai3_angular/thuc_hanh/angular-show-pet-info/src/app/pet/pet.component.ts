import { Component, OnInit } from '@angular/core';
import {Pet} from '../model/Pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
  pet: Pet = {
    name : 'Puppie',
    image: 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg'
  };
  constructor() { }

  ngOnInit(): void {
  }

}
