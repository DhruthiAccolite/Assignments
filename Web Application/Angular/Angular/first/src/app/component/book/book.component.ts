import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Book } from 'src/app/model/book';
import { BookService } from 'src/app/providers/book.service';
@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent implements OnInit {
  bookId:any;
  book:Book;
 
  constructor(private route:ActivatedRoute,private bookService:BookService) { }

  ngOnInit() {
    this.bookId=this.route.snapshot.paramMap.get('id');
    console.log(this.bookId);

    this.bookService.getBookById(this.bookId).subscribe((response)=> {
      if(response){
        this.book=response;
      }
    })
  }

}
