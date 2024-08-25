import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaArtistasComponent } from './lista-artistas.component';
import { MatTableModule } from '@angular/material/table';

@NgModule({
    imports: [CommonModule, MatTableModule, ListaArtistasComponent],
    exports: [ListaArtistasComponent],
})
export class ArtistasModule {}
