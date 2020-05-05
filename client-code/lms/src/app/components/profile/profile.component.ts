import { Component, OnInit } from '@angular/core';

import { BooksService } from 'src/app/services/books.service';
import { UserService } from 'src/app/services/user.service';
import {Router} from '@angular/router';
import {DatePipe} from '@angular/common'
import { User } from 'src/app/model/user';
import { Observable } from 'rxjs';
import { Book } from 'src/app/model/book';


@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  currentUser:User = new User;
  booksList:Array<Book>;

  constructor(private bookService:BooksService,
    private userService:UserService,private router:Router) {
      this.currentUser = this.userService.currentUserValue
     }

  ngOnInit(): void {
    if(!this.currentUser){
      this.router.navigate(['/login']);

    }
  }

  findBooks(){
    this.bookService.findAllBooks().subscribe(
      response =>{
        this.booksList = response;
      },err =>{

      });
  }

  logout(){
    this.userService.logout().subscribe(
      data =>{
        this.router.navigate(['/login']);
      });
  }

}
