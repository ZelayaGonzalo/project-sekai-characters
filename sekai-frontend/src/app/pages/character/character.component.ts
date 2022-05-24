import { Component, OnInit } from '@angular/core';
import { Router , ActivatedRoute, Params, Data} from '@angular/router'
import { DataServiceService } from 'src/app/data-service.service';
import { Member, Unit } from 'src/app/Interfaces';

@Component({
  selector: 'app-character',
  templateUrl: './character.component.html',
  styleUrls: ['./character.component.scss']
})
export class CharacterComponent implements OnInit {

  charID:Number = 0
  member?:Member

  constructor(private router:ActivatedRoute, private dataService:DataServiceService) { }

  ngOnInit(): void {
    this.router.params.subscribe((params:Params)=>{
      this.charID = params['id']
      this.dataService.getMember(this.charID).subscribe(data=>{
        this.member = data
      })
    })
  }

}
