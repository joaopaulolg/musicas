import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header.component';
import { HomeComponent } from './home.component';

@NgModule({
  declarations: [HeaderComponent, HomeComponent],
  imports: [CommonModule, RouterModule],
  exports: [HeaderComponent, HomeComponent],
})
export class CoreModule {}
