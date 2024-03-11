import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaArtistasComponent } from './lista-artistas.component';
import { MatTableModule } from '@angular/material/table';

@NgModule({
    declarations: [ListaArtistasComponent],
    imports: [CommonModule, MatTableModule],
    exports: [ListaArtistasComponent],
})
export class ArtistasModule {}
