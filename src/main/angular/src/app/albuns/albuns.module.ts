import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaAlbunsComponent } from './lista-albuns.component';

@NgModule({
  declarations: [ListaAlbunsComponent],
  imports: [CommonModule],
  exports: [ListaAlbunsComponent],
})
export class AlbunsModule {}
