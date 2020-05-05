import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./components/home/home.component"
import { LoginComponent } from './components/login/login.component';
import { componentFactoryName } from '@angular/compiler';
import { LibraryComponent } from './components/library/library.component';
import { BooksComponent } from './components/books/books.component';

const routes: Routes = [
  {path :'', redirectTo:'home', pathMatch:'full' },
  {path :'home', component: HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'library', component:LibraryComponent},
  {path: 'book', component:BooksComponent},
  {path: 'register',component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
