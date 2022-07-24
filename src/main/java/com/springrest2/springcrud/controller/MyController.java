package com.springrest2.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest2.springcrud.entities.Book;
import com.springrest2.springcrud.services.BookService;


@RestController
public class MyController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	// get the books
	
	@GetMapping("/Books")
	public List<Book> getBooks()
	{
		
		return this.bookService.getBooks();
		
	}
	
	@GetMapping("/Books/{bookId}")
	 public Book getBook(@PathVariable String bookId) 
	 {
		 return this.bookService.getBook(Long.parseLong(bookId));
		 
	 }
	
	
	@PostMapping("/Books")
	 public Book addBook(@RequestBody Book book)
	 {
		 return this.bookService.addBook(book);
	 }
	
	
	@PutMapping("/Books")
	 public Book updateBook(@RequestBody Book book)
	 {
		 return this.bookService.updateBook(book);
	 }
	
	
	@DeleteMapping("/Books/{bookId}")
	 public ResponseEntity<HttpStatus> deleteBook(@PathVariable String bookId){
		 try {
			 this.bookService.deleteBook(Long.parseLong(bookId));
			 return new ResponseEntity<>(HttpStatus.OK);
			 
		 } catch(Exception e) {
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
	 }

}
