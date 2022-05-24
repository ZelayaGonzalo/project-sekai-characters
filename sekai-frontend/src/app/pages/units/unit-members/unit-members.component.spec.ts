import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UnitMembersComponent } from './unit-members.component';

describe('UnitMembersComponent', () => {
  let component: UnitMembersComponent;
  let fixture: ComponentFixture<UnitMembersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UnitMembersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UnitMembersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
