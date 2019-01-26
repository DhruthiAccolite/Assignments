package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;

@Repository
public class BookDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> all(){
		return jdbcTemplate.query("select * from book",(rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("book_name"),
					rs.getString("author_name"),
					rs.getDouble("price"),
					rs.getString("descript"),
					rs.getString("checkout")
					);
		});
	}
	
	public List<Book> getById(String id){
		return jdbcTemplate.query("select * from book where id=\""+id+"\";",(rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("book_name"),
					rs.getString("author_name"),
					rs.getDouble("price"),
					rs.getString("descript"),
					rs.getString("checkout")
					);
		});
	}
	public Book create(Book book) {
		System.out.println(book.getBookName());
		jdbcTemplate.update("insert into book(id,book_name,descript,author_name,price) values(?,?,?,?,?)",new Object[] {
				book.getId(),book.getBookName(),book.getDescription(),book.getAuthorName(),book.getPrice()});
		
		return book;
	}
	public String getId(String id){
		return jdbcTemplate.queryForObject("select book_name from book where id=\""+id+"\";",String.class);
		
		
		
	}

	public List<Book> checkout(String bookId) {
		jdbcTemplate.update("update book set checkout=\"yes\" where id=\""+bookId+"\";");
		return jdbcTemplate.query("select * from book where checkout='yes';",(rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("book_name"),
					rs.getString("author_name"),
					rs.getDouble("price"),
					rs.getString("descript"),
					rs.getString("checkout")
					);
		});
	}
}
