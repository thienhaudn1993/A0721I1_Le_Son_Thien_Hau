import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TaoDichVuComponent } from './tao-dich-vu.component';

describe('TaoDichVuComponent', () => {
  let component: TaoDichVuComponent;
  let fixture: ComponentFixture<TaoDichVuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TaoDichVuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TaoDichVuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
