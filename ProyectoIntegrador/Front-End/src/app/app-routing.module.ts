import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewExperienciaComponent } from './components/curriculum/experiencia/new-experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './components/curriculum/experiencia/edit-experiencia/edit-experiencia.component';
import { NewEducacionComponent } from './components/curriculum/educacion/new-educacion/new-educacion.component';
import { EditEducacionComponent } from './components/curriculum/educacion/edit-educacion/edit-educacion.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'nuevaexp', component: NewExperienciaComponent },
  { path: 'editexp/:id', component: EditExperienciaComponent },
  { path: 'nuevaedu', component: NewEducacionComponent },
  { path: 'editedu/:id', component: EditEducacionComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
