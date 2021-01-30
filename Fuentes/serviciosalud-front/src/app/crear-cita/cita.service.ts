import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Cita} from './cita';

@Injectable()
export class CitaService {
  private urlEndPoint = 'http://localhost:8080/api2/citas';

  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  constructor(private http: HttpClient) {
  }

  create2(cita: Cita): Observable<Cita> {
    return this.http.post<Cita>(this.urlEndPoint, cita, {headers: this.httpHeaders});
  }


}
