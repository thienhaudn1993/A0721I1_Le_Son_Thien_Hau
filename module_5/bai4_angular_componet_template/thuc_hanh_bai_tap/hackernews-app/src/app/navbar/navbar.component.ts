import { Component, OnInit } from '@angular/core';
import {IArticle} from '../model/IArticle';
import {ArticleComponent} from '../article/article.component';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  // articlesNav: IArticle[] = ArticleComponent.ar;
  constructor() { }

  ngOnInit(): void {
  }

}
