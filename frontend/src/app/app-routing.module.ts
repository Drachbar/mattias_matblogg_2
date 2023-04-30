import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListaComponent} from "./lista/lista.component";
import {StartsidaComponent} from "./startsida/startsida.component";

const routes: Routes = [
  {path:'', component: StartsidaComponent},
  {path:'lista', component: ListaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
