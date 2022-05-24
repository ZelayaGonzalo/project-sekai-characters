import { Component, OnInit } from '@angular/core';
import { Router , ActivatedRoute, Params} from '@angular/router'
import { DataServiceService } from '../../../data-service.service'
import { Member, Unit } from '../../../Interfaces'
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-unit-details-page',
  templateUrl: './unit-details-page.component.html',
  styleUrls: ['./unit-details-page.component.scss']
})
export class UnitDetailsPageComponent implements OnInit {

  unitID:number = 2;
  unit?:Unit;
  vidURL:any;
  constructor( public router:ActivatedRoute, private dataService:DataServiceService, private domSanitizer:DomSanitizer) { 
  }

  ngOnInit(): void {
    this.router.params.subscribe((params:Params)=>{
      this.unitID = params['unit']
      this.dataService.getUnit(this.unitID).subscribe(data=>{
        this.unit = data;
        this.vidURL = this.unit?.introVid != null && this.domSanitizer.bypassSecurityTrustResourceUrl(this.unit.introVid)
      })
    })
  }

  sort() {
    return this.unit?.members.sort((a, b) => a.showOrder > b.showOrder ? 1 : a.showOrder === b.showOrder? 0 : -1);
  }

}
