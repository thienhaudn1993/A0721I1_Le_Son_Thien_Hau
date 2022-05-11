import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductCreateComponent } from './product-create/product-create.component';
import { ProductListComponent } from './product-list/product-list.component';
import {ReactiveFormsModule} from '@angular/forms';
import { ProductEditComponent } from './product-edit/product-edit.component';
import { ProductDeleteComponent } from './product-delete/product-delete.component';
import {HttpClientModule} from '@angular/common/http';
import { CategoryListComponent } from './category/category-list/category-list.component';
import { CategoryEditComponent } from './category/category-edit/category-edit.component';
import { CategoryDeleteComponent } from './category/category-delete/category-delete.component';
import { CategoryCreateComponent } from './category/category-create/category-create.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductCreateComponent,
    ProductListComponent,
    ProductEditComponent,
    ProductDeleteComponent,
    CategoryListComponent,
    CategoryEditComponent,
    CategoryDeleteComponent,
    CategoryCreateComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule,
        HttpClientModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
