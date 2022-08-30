import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog-idea-form',
  templateUrl: './dialog-idea-form.component.html',
  styleUrls: ['./dialog-idea-form.component.css']
})
export class DialogIdeaFormComponent {

  ideaForm = this.formBuilder.group({
    id: '',
    title: '',
    description: ''
  });

  constructor(
    public dialogRef: MatDialogRef<DialogIdeaFormComponent>,
    private formBuilder: FormBuilder
  ) { }

  actionFunction() {
    alert("You have logged out.");
    this.closeModal();
  }

  closeModal() {
    this.dialogRef.close();
  }
}
