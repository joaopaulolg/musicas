import {Component, OnInit} from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
    selector: 'rip-header',
    templateUrl: './header.component.html',
    standalone: true,
    imports: [RouterLink]
})
export class HeaderComponent implements OnInit {

    ngOnInit(): void {
    }

}
