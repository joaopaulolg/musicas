import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaEstilosComponent } from './lista-estilos.component';
import { MatTableModule } from '@angular/material/table';

@NgModule({
    imports: [CommonModule, MatTableModule, ListaEstilosComponent],
    exports: [ListaEstilosComponent],
})
export class EstilosModule {}
