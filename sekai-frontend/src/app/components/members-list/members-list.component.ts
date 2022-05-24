import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-members-list',
  templateUrl: './members-list.component.html',
  styleUrls: ['./members-list.component.scss']
})
export class MembersListComponent implements OnInit {

  @Input() logo?:string
  @Input() unitId?:number
  @Input() memberId?:number
  @Input() unitColor?:String

  constructor() { }

  ngOnInit() {
  }

  nextGroup(id:number):void{
    if(id >= 1 && id <6){
      this.unitId = 3
      console.log(this.unitId)
    }
    return
  }

}
