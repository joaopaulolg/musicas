import { Component, OnInit } from '@angular/core';
import { Estilo } from '../shared/model/estilo';

@Component({
    selector: 'rip-lista-estilos',
    templateUrl: './lista-estilos.component.html',
    styleUrls: ['./lista-estilos.component.css'],
})
export class ListaEstilosComponent implements OnInit {
    estilos: Estilo[];
    displayedColumns: string[] = ['nome', 'action'];

    constructor() {}

    ngOnInit(): void {
        this.estilos = [
            { id: 1, nome: 'Rock And Roll' },
            { id: 2, nome: 'Heavy Metal' },
            { id: 3, nome: 'Blues' },
        ];
    }

    adicionar() {
        console.log('adicionar acionado!');
    }

    editar(idEstilo: number) {
        console.log('editar acionado!');
    }

    excluir(idEstilo: number) {
        console.log('excluir acionado!');
    }
}
