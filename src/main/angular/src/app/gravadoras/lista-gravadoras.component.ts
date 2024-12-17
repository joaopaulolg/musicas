import { Component, OnInit } from '@angular/core';
import { Gravadora } from '../shared/model/gravadora';

@Component({
    selector: 'rip-lista-gravadoras',
    templateUrl: './lista-gravadoras.component.html',
    styleUrls: ['./lista-gravadoras.component.css'],
    imports: []
})
export class ListaGravadorasComponent implements OnInit {
    gravadoras: Gravadora[];

    constructor() {}

    ngOnInit(): void {
        this.gravadoras = [
            { id: 1, nome: 'Warner Bros.', anoFundacao: 1954 },
            { id: 2, nome: 'Nuclear Blast', anoFundacao: 1964 },
            { id: 3, nome: 'Earache', anoFundacao: 1974 },
        ];
    }

    adicionar() {
        console.log('adicionar acionado!');
    }

    editar(idGravadora: number) {
        console.log('editar acionado!');
    }

    excluir(idGravadora: number) {
        console.log('excluir acionado!');
    }
}
