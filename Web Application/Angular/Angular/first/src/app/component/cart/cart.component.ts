import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { BookService } from 'src/app/providers/book.service';
import { ActivatedRoute } from '@angular/router';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  books:any = [];
  bookId:string;
  constructor(private route:ActivatedRoute,private bookService: BookService) { }

  ngOnInit() {
    this.bookId=this.route.snapshot.paramMap.get('id');
    this.bookService.checkoutBook(this.bookId).subscribe((response)=>{
      if(response && response.length > 0){
        this.books=response;
      }
  });
  }

}
