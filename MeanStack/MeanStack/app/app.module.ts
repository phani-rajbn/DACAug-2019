import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from "@angular/forms";
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CalcComponent } from './Components/calc/calc.component';
import { EmpAppComponent } from './Components/emp-app/emp-app.component';

@NgModule({
  declarations: [
    AppComponent,
    CalcComponent,
    EmpAppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
