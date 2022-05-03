import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularFormComponent } from './angular-form.component';

describe('AngularFormComponent', () => {
  let component: AngularFormComponent;
  let fixture: ComponentFixture<AngularFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
