import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: 'home',
        loadComponent: () =>
            import('./core/home.component').then((m) => m.HomeComponent),
    },
    {
        path: 'listarEstilos',
        loadComponent: () =>
            import('./estilos/lista-estilos.component').then(
                (m) => m.ListaEstilosComponent
            ),
    },
    {
        path: 'listarArtistas',
        loadComponent: () =>
            import('./artistas/lista-artistas.component').then(
                (m) => m.ListaArtistasComponent
            ),
    },
    {
        path: 'listarGravadoras',
        loadComponent: () =>
            import('./gravadoras/lista-gravadoras.component').then(
                (m) => m.ListaGravadorasComponent
            ),
    },
    {
        path: 'listarBandas',
        loadComponent: () =>
            import('./bandas/lista-bandas.component').then(
                (m) => m.ListaBandasComponent
            ),
    },
    {
        path: 'listarAlbuns',
        loadComponent: () =>
            import('./albuns/lista-albuns.component').then(
                (m) => m.ListaAlbunsComponent
            ),
    },
    {
        path: '',
        pathMatch: 'full',
        redirectTo: 'home',
    },
];
