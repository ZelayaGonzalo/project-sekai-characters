import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-units-list',
  templateUrl: './units-list.component.html',
  styleUrls: ['./units-list.component.scss']
})
export class UnitsListComponent implements OnInit {

  @Input() currentUnit?:Number

  constructor() { }

  ngOnInit(): void {
  }

}
