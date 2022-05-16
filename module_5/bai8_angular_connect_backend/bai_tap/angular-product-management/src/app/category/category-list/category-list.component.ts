import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../../service/category/category.service';
import {Category} from '../../model/category';
import {Router} from '@angular/router';


@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {
  categories: Category[] = [];
  constructor(private categoryService: CategoryService, private router: Router) { }

  ngOnInit(): void {
    this.categoryService.getAllCategory().subscribe(
      (data) => {
        this.categories = data;
      }
    );
  }

  deleteCategory(id: number) {
    this.categoryService.deleteCategory(id).subscribe(
      () => {
        alert('Delete Success');
        console.log(id);
      },
      () => {},
      () => {
        this.ngOnInit();
      }
    );
  }
}
