import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { MoviesComponent } from './movies/movies.component';
import { LoginComponent } from './login/login.component';
import { AddMovieComponent } from './add-movie/add-movie.component';


const routes: Routes = [
  {path : 'header', component : HeaderComponent},
  {path : 'movies', component : MoviesComponent},
  {path : 'login', component : LoginComponent},
  {path : 'add-movie', component : AddMovieComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
