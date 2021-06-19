import { ArtistasModule } from './artistas/artistas.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TesteComponent } from './teste/teste.component';
import { CoreModule } from './core/core.module';

@NgModule({
  declarations: [AppComponent, TesteComponent],
  imports: [BrowserModule, CoreModule, AppRoutingModule, ArtistasModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
