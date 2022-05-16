import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { XoaDichVuComponent } from './xoa-dich-vu.component';

describe('XoaDichVuComponent', () => {
  let component: XoaDichVuComponent;
  let fixture: ComponentFixture<XoaDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ XoaDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(XoaDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
