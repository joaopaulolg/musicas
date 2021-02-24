import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {HomeComponent} from './home/home.component';
import {ListaArtistasModule} from './artistas/lista-artistas/lista-artistas.module';
import { TesteComponent } from './teste/teste.component';

@NgModule({
    declarations: [
        AppComponent,
        HeaderComponent,
        HomeComponent,
        TesteComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ListaArtistasModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
