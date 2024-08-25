import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaGravadorasComponent } from './lista-gravadoras.component';

@NgModule({
    imports: [CommonModule, ListaGravadorasComponent],
    exports: [ListaGravadorasComponent],
})
export class GravadorasModule {}
