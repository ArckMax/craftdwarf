// Modules imports
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";

// Components imports
import { AppComponent } from './app.component';

// Pipe imports
import { DisplayLimitationPipe } from './pipes/display-limitation.pipe';


@NgModule({
  declarations: [
    AppComponent,
    DisplayLimitationPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
  ],
  providers: [
    HttpClientModule,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
