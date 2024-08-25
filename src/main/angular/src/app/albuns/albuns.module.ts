import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaAlbunsComponent } from './lista-albuns.component';

@NgModule({
    imports: [CommonModule, ListaAlbunsComponent],
    exports: [ListaAlbunsComponent],
})
export class AlbunsModule {}
