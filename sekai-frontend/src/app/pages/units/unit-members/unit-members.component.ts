import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-unit-members',
  templateUrl: './unit-members.component.html',
  styleUrls: ['./unit-members.component.scss']
})
export class UnitMembersComponent implements OnInit {

  @Input() character?:String;
  @Input() logo?:String;
  @Input() background?:String;
  @Input() right?:boolean
  @Input() color?:String
  class:String ='empty';
  mouseOver(){
    this.class = 'hover'
  }
  mouseOut(){
    this.class='no-hover'
  }
  constructor() { }

  ngOnInit(): void {
  }

}
