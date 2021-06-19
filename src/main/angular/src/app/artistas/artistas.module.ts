import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaArtistasComponent } from './lista-artistas/lista-artistas.component';

@NgModule({
  declarations: [ListaArtistasComponent],
  imports: [CommonModule],
  exports: [ListaArtistasComponent],
})
export class ArtistasModule {}
