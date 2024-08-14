import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListTechnicianComponent } from './list-technician.component';

describe('ListTechnicianComponent', () => {
  let component: ListTechnicianComponent;
  let fixture: ComponentFixture<ListTechnicianComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListTechnicianComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListTechnicianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
