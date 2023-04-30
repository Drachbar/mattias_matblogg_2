import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StartsidaComponent } from './startsida.component';

describe('StartsidaComponent', () => {
  let component: StartsidaComponent;
  let fixture: ComponentFixture<StartsidaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StartsidaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StartsidaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
