import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { BookService } from 'src/app/providers/book.service';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  books:any = [];
  book:any;
  constructor(private bookService: BookService) { }

  ngOnInit() {
   
    this.bookService.getAllBooks().subscribe((response)=>{
        if(response && response.length > 0){
          this.books=response;
        }
    });
  }

}
