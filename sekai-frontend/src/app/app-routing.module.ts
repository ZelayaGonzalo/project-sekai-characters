import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './pages/home/home-page/home-page.component';
import { UnitsPageComponent } from './pages/units/units-page/units-page.component';
import { CharacterComponent } from './pages/character/character.component';
import { UnitDetailsPageComponent } from './pages/unit-details/unit-details-page/unit-details-page.component';

const routes: Routes = [
  {path:'home', component: HomePageComponent},
  {path:'units', component: UnitsPageComponent },
  {path:'units/:unit', component: UnitDetailsPageComponent},
  {path:'character/:id', component: CharacterComponent},
  
  {path:'**', component: HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {scrollPositionRestoration:'enabled'})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
