import { Component, OnInit } from '@angular/core';
import {Cita} from './cita';
import {CitaService} from './cita.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-crear-cita',
  templateUrl: './crear-cita.component.html',
  styleUrls: ['./crear-cita.component.css']
})
export class CrearCitaComponent implements OnInit {
  public cita: Cita = new Cita();
  constructor(private citaService: CitaService, private router: Router) { }

  ngOnInit(): void {
  }
  public create2(): void{
    this.citaService.create2(this.cita).subscribe(
      response => this.router.navigate([''])
    );
  }

}
