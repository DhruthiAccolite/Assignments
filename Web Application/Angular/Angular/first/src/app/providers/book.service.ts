import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { }

  getAllBooks():Observable<any>{
    return this.http.get("/Library/books");
  }
  getOne():Observable<any>{
    return this.http.get("/Library/book");
  }

  getBookById(id):Observable<any>{
    let url='/Library/book/'+id+'/get';
    return this.http.get(url);
  }
  
  addBook(book: any): Observable<any>{
    return this.http.post('Library/books',book);
  }

  checkoutBook(id):Observable<any>{
    let url='/Library/checkout/'+id+'/get';
    return this.http.get(url);
  }
}
