import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BooksService } from 'src/app/services/books.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  bookId: string;
  currentBook:string;
  
  book: Book
  constructor(private bookService: BooksService,private router:ActivatedRoute) { 

  }

  ngOnInit(): void {
  }

}
