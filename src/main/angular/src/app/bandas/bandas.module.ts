import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaBandasComponent } from './lista-bandas.component';

@NgModule({
    imports: [CommonModule, ListaBandasComponent],
    exports: [ListaBandasComponent],
})
export class BandasModule {}
