import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../../service/category/category.service';
import {FormControl, FormGroup} from '@angular/forms';
import {Router} from '@angular/router';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  formCategory: FormGroup;
  constructor(private categoryService: CategoryService, private router: Router) { }

  ngOnInit(): void {
    this.formCategory = new FormGroup({
      // idCategory: new FormControl(),
      // id tự tăng
      nameCategory: new FormControl()
    });
  }

  submitCategory() {
    // @ts-ignore
    this.categoryService.createCategory(this.formCategory.value).subscribe(
      (data) => {
        console.log(data);
        alert('Create Category Success');
      },
      () => {},
      () => {
        this.router.navigateByUrl('/category');
      }
    );
  }
}
