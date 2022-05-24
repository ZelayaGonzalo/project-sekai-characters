import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BodyComponent } from './pages/home/body/body.component';
import { HomePageComponent } from './pages/home/home-page/home-page.component';
import { BigButtonComponent } from './components/big-button/big-button.component';
import { UnitsPageComponent } from './pages/units/units-page/units-page.component';
import { UnitMembersComponent } from './pages/units/unit-members/unit-members.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { PageTitleComponent } from './components/page-title/page-title.component';
import { CharacterComponent } from './pages/character/character.component';
import { BrowserComponent } from './pages/cards/browser/browser.component';
import { UnitDetailsPageComponent } from './pages/unit-details/unit-details-page/unit-details-page.component';
import { UnitsListComponent } from './components/units-list/units-list.component';
import { MembersListComponent } from './components/members-list/members-list.component';
import { HttpClientModule } from '@angular/common/http';
import { DataServiceService } from './data-service.service';
import { FooterComponent } from './components/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    BodyComponent,
    HomePageComponent,
    BigButtonComponent,
    UnitsPageComponent,
    UnitMembersComponent,
    NavBarComponent,
    PageTitleComponent,
    CharacterComponent,
    BrowserComponent,
    UnitDetailsPageComponent,
    UnitsListComponent,
    MembersListComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [DataServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
