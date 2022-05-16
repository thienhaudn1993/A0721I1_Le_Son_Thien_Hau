import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DanhSachDichVuComponent} from './dichvu/danh-sach-dich-vu/danh-sach-dich-vu.component';
import {HomeComponent} from './home/home.component';
import {ChiTietDichVuComponent} from './dichvu/chi-tiet-dich-vu/chi-tiet-dich-vu.component';
import {TaoDichVuComponent} from './dichvu/tao-dich-vu/tao-dich-vu.component';
import {ChinhSuaDichVuComponent} from './dichvu/chinh-sua-dich-vu/chinh-sua-dich-vu.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';
import {CustomerCreateComponent} from './customer/customer-create/customer-create.component';
import {CustomerEditComponent} from './customer/customer-edit/customer-edit.component';
import {ContractListComponent} from './contract/contract-list/contract-list.component';
import {ContractCreateComponent} from './contract/contract-create/contract-create.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'service/list',
    component: DanhSachDichVuComponent
  },
  {
    path: 'service/detail/:id',
    component: ChiTietDichVuComponent
  },
  {
    path: 'service/create',
    component: TaoDichVuComponent
  },
  {path: 'service/edit/:id', component: ChinhSuaDichVuComponent},
  {path: 'customer/list', component: CustomerListComponent},
  {path: 'customer/create', component: CustomerCreateComponent},
  {path: 'customer/edit/:id', component: CustomerEditComponent},
  {path: 'contract/list', component: ContractListComponent},
  {path: 'contract/create', component: ContractCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
