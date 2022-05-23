import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './product/home/home.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'products/list', component: ProductListComponent},
  {path: 'products/edit/:id', component: ProductEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
