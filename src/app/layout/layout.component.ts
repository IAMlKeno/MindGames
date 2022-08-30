import { Component, OnInit } from '@angular/core';
import { Idea, ideas } from '../idea';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.css']
})
export class LayoutComponent implements OnInit {

  ideas: Idea[] = ideas;

  constructor() {
  }

  ngOnInit(): void {
  }

}
