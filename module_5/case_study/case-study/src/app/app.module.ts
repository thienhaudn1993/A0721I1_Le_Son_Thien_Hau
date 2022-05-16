import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DanhSachDichVuComponent } from './dichvu/danh-sach-dich-vu/danh-sach-dich-vu.component';
import { ChinhSuaDichVuComponent } from './dichvu/chinh-sua-dich-vu/chinh-sua-dich-vu.component';
import { XoaDichVuComponent } from './dichvu/xoa-dich-vu/xoa-dich-vu.component';
import { TaoDichVuComponent } from './dichvu/tao-dich-vu/tao-dich-vu.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ChiTietDichVuComponent } from './dichvu/chi-tiet-dich-vu/chi-tiet-dich-vu.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { CustomerEditComponent } from './customer/customer-edit/customer-edit.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';
import { ContractCreateComponent } from './contract/contract-create/contract-create.component';
import { ContractListComponent } from './contract/contract-list/contract-list.component';


@NgModule({
  declarations: [
    AppComponent,
    DanhSachDichVuComponent,
    ChinhSuaDichVuComponent,
    XoaDichVuComponent,
    TaoDichVuComponent,
    HomeComponent,
    ChiTietDichVuComponent,
    CustomerListComponent,
    CustomerEditComponent,
    CustomerCreateComponent,
    ContractCreateComponent,
    ContractListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
