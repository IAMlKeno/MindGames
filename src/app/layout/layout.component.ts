import { Component } from '@angular/core';
import { Idea, ideas } from '../idea';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { FormBuilder } from '@angular/forms';
import { DialogIdeaFormComponent } from '../dialog-idea-form/dialog-idea-form.component';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.css']
})
export class LayoutComponent {

  ideas: Idea[] = ideas;
  // ideaForm = this.formBuilder.group({
  //   id: '',
  //   title: '',
  //   description: ''
  // });

  constructor(
    public dialog: MatDialog,
    // private formBuilder: FormBuilder
  ) {}

  openDialog(enterAnimationDuration: string, exitAnimationDuration: string): void {
    this.dialog.open(DialogIdeaFormComponent, {
      width: '250px',
      enterAnimationDuration,
      exitAnimationDuration,
    });
  }

  // onSubmit(): void {
  //   // Process checkout data here
  //   // this.items = this.cartService.clearCart();
  //   console.warn('Your order has been submitted', this.ideaForm.value);
  //   // this.checkoutForm.reset();
  // }

}

