import { Injectable, Type } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs'
import { BooksComponent } from '../components/books/books.component';
import { Book } from '../model/book';

let API_URL = "http://localhost:8080/book/"

@Injectable({
  providedIn: 'root'
})
export class BooksService {

  book : Book = new Book;
  constructor(private http:HttpClient) { }

  // findAllBooks(): Observable<any>{
  //   return this.http.get(API_URL+'getAll',
  //   {headers:{"Content-Type":"application/json; charset-UTF-8"}});
  // }
  findAllBooks(): Observable<any>{
    return this.http.get(API_URL+'getAll');
  }
}
