import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from './product-list/product-list.component';
import {ProductCreateComponent} from './product-create/product-create.component';
import {ProductEditComponent} from './product-edit/product-edit.component';
import {ProductDeleteComponent} from './product-delete/product-delete.component';
import {CategoryListComponent} from './category/category-list/category-list.component';
import {CategoryCreateComponent} from './category/category-create/category-create.component';
import {CategoryEditComponent} from './category/category-edit/category-edit.component';


const routes: Routes = [
  {
    path: 'product/list',
    component: ProductListComponent
  },
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/edit/:id',
    component: ProductEditComponent
  },
  {
    path: 'product/delete/:id',
    component: ProductDeleteComponent
  },
  {
    path: 'category',
    component: CategoryListComponent
  },
  {
    path: 'category/create',
    component: CategoryCreateComponent
  },
  {
    path: 'category/edit/:id',
    component: CategoryEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
