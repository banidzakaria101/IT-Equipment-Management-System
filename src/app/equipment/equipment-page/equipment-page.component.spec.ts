import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EquipmentPageComponent } from './equipment-page.component';

describe('EquipmentPageComponent', () => {
  let component: EquipmentPageComponent;
  let fixture: ComponentFixture<EquipmentPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EquipmentPageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EquipmentPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
