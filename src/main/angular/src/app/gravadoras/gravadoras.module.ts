import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaGravadorasComponent } from './lista-gravadoras.component';

@NgModule({
  declarations: [ListaGravadorasComponent],
  imports: [CommonModule],
  exports: [ListaGravadorasComponent],
})
export class GravadorasModule {}
