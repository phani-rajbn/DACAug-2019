import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpAppComponent } from './emp-app.component';

describe('EmpAppComponent', () => {
  let component: EmpAppComponent;
  let fixture: ComponentFixture<EmpAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmpAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
