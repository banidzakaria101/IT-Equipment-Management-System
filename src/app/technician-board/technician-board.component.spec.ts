import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TechnicianBoardComponent } from './technician-board.component';

describe('TechnicianBoardComponent', () => {
  let component: TechnicianBoardComponent;
  let fixture: ComponentFixture<TechnicianBoardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TechnicianBoardComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TechnicianBoardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
