import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CrearPacienteComponent } from './crear-paciente/crear-paciente.component';
import { RouterModule, Router, Routes} from '@angular/router';
import { MainComponent } from './main/main.component';
import { CrearCitaComponent } from './crear-cita/crear-cita.component';
import { VerCitaComponent } from './ver-cita/ver-cita.component';
import { HttpClientModule } from '@angular/common/http';

const routes: Routes = [
  {path: '', component: MainComponent},
  {path: 'crear-paciente', component: CrearPacienteComponent},
  {path: 'crear-cita', component: CrearCitaComponent},
  {path: 'ver-cita', component: VerCitaComponent}

  ];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CrearPacienteComponent,
    MainComponent,
    CrearCitaComponent,
    VerCitaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
