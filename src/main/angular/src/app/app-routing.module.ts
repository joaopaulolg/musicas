import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './core/home.component';
import { ListaArtistasComponent } from './artistas/lista-artistas.component';
import { ListaEstilosComponent } from './estilos/lista-estilos.component';
import { ListaGravadorasComponent } from './gravadoras/lista-gravadoras.component';
import { ListaBandasComponent } from './bandas/lista-bandas.component';
import { ListaAlbunsComponent } from './albuns/lista-albuns.component';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'listarEstilos',
    component: ListaEstilosComponent,
  },
  {
    path: 'listarArtistas',
    component: ListaArtistasComponent,
  },
  {
    path: 'listarGravadoras',
    component: ListaGravadorasComponent,
  },
  {
    path: 'listarBandas',
    component: ListaBandasComponent,
  },
  {
    path: 'listarAlbuns',
    component: ListaAlbunsComponent,
  },
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home',
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule],
})
export class AppRoutingModule {}
