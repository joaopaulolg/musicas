import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaBandasComponent } from './lista-bandas.component';

@NgModule({
  declarations: [ListaBandasComponent],
  imports: [CommonModule],
  exports: [ListaBandasComponent],
})
export class BandasModule {}
