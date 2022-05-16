import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChiTietDichVuComponent } from './chi-tiet-dich-vu.component';

describe('ChiTietDichVuComponent', () => {
  let component: ChiTietDichVuComponent;
  let fixture: ComponentFixture<ChiTietDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChiTietDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChiTietDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
