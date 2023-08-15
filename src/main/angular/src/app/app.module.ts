import { AlbunsModule } from './albuns/albuns.module';
import { BandasModule } from './bandas/bandas.module';
import { GravadorasModule } from './gravadoras/gravadoras.module';
import { EstilosModule } from './estilos/estilos.module';
import { ArtistasModule } from './artistas/artistas.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [AppComponent],
  imports: [
    BrowserModule,
    CoreModule,
    AppRoutingModule,
    ArtistasModule,
    EstilosModule,
    GravadorasModule,
    BandasModule,
    AlbunsModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
