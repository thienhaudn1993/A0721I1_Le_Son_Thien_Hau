import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChinhSuaDichVuComponent } from './chinh-sua-dich-vu.component';

describe('ChinhSuaDichVuComponent', () => {
  let component: ChinhSuaDichVuComponent;
  let fixture: ComponentFixture<ChinhSuaDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChinhSuaDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChinhSuaDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
