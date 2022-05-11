import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../../service/category/category.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Category} from '../../model/category';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit {
  id: number;
  category: Category;
  formEditCategory: FormGroup;
  constructor(private categoryServer: CategoryService, private activatedRouter: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      // @ts-ignore
      this.category = this.categoryServer.findCatogoryById(this.id).subscribe(
        (category) => {
          this.formEditCategory = new FormGroup({
            id: new FormControl(category.id),
            nameCategory: new FormControl(category.nameCategory)
          });
        }
      );
    });
  }

  editCategory() {
    this.categoryServer.editCategory(this.id, this.formEditCategory.value).subscribe(
      () => {
        alert('Update Category Success');
      },
      () => {},
      () => {
        this.router.navigateByUrl('/category');
      }
    );
  }
}
