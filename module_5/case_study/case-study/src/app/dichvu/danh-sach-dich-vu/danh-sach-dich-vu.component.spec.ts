import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DanhSachDichVuComponent } from './danh-sach-dich-vu.component';

describe('DanhSachDichVuComponent', () => {
  let component: DanhSachDichVuComponent;
  let fixture: ComponentFixture<DanhSachDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DanhSachDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DanhSachDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
