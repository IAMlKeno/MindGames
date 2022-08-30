import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DialogIdeaFormComponent } from './dialog-idea-form.component';

describe('DialogIdeaFormComponent', () => {
  let component: DialogIdeaFormComponent;
  let fixture: ComponentFixture<DialogIdeaFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DialogIdeaFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DialogIdeaFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
