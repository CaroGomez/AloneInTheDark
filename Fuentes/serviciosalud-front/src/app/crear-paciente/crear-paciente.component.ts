import { Component, OnInit } from '@angular/core';
import {Paciente} from './paciente';
import {PacienteService} from './paciente.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-crear-paciente',
  templateUrl: './crear-paciente.component.html',
  styleUrls: ['./crear-paciente.component.css']
})
export class CrearPacienteComponent implements OnInit {
  public paciente: Paciente = new Paciente();
  constructor(private pacienteService: PacienteService, private router: Router) { }

  ngOnInit(): void {
  }

  public create(): void{
    this.pacienteService.create(this.paciente).subscribe(
      response => this.router.navigate([''])
    );
  }

}
