import { Component, OnInit } from '@angular/core';
import { BooksService } from 'src/app/services/books.service';
import { UserService } from 'src/app/services/user.service';
import { User } from 'src/app/model/user';
import { Book } from 'src/app/model/book';
import { Router } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user : User;
  bookList : Array<Book>;
  errorMessage :string;
  infoMessage : string;
  currentUser : User;
  constructor(private bookService:BooksService,
              private userService:UserService,
              private route:Router) {
                this.currentUser = this.userService.currentUserValue;
               }

  ngOnInit(): void {
    this.findAllBooks();
  }

  findAllBooks(){
    this.bookService.findAllBooks().subscribe(data =>{
      this.bookList = data;
      console.log(data);
    },err =>{
      this.errorMessage= err;
    });
  }

  enroll(book:Book){
    if(!this.currentUser){
      this.errorMessage = "You should sign in to enroll a book";
      return;
    }
    //var transaction = new Transaction 
    console.log(book);

  }

  detail(book:Book){
    console.log(book);
  }

}
