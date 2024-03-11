import { Component, OnInit } from '@angular/core';
import { MatTableModule } from '@angular/material/table';

import { Artista } from '../shared/model/artista';

@Component({
    selector: 'rip-lista-artistas',
    templateUrl: './lista-artistas.component.html',
    styleUrls: ['./lista-artistas.component.css'],
})
export class ListaArtistasComponent implements OnInit {
    artistas: Artista[];
    displayedColumns: string[] = ['nome', 'action'];

    ngOnInit(): void {
        this.artistas = [
            { id: 1, nome: 'Led Zeppelin' },
            { id: 2, nome: 'Deep Purple' },
            { id: 3, nome: 'Black Sabbath' },
        ];
    }

    adicionar() {
        console.log('adicionar acionado!');
    }

    editar(idArtista: number) {
        console.log('editar acionado! ' + idArtista);
    }

    excluir(idArtista: number) {
        console.log('excluir acionado! ' + idArtista);
    }
}
