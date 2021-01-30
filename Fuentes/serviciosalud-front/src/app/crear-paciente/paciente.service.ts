import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Paciente} from './paciente';

@Injectable()
export class PacienteService {
  private urlEndPoint = 'http://localhost:8080/api/pacientes';

  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  constructor(private http: HttpClient) {
  }

  create(paciente: Paciente): Observable<Paciente> {
    return this.http.post<Paciente>(this.urlEndPoint, paciente, {headers: this.httpHeaders});
  }


}
