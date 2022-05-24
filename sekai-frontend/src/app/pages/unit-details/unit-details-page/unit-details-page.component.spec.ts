import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UnitDetailsPageComponent } from './unit-details-page.component';

describe('UnitDetailsPageComponent', () => {
  let component: UnitDetailsPageComponent;
  let fixture: ComponentFixture<UnitDetailsPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UnitDetailsPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UnitDetailsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
