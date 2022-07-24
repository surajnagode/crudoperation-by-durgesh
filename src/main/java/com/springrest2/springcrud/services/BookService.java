package com.springrest2.springcrud.services;

import java.util.List;

import com.springrest2.springcrud.entities.Book;

public interface BookService {
	
	public List<Book> getBooks();
	
	public Book getBook(long bookId);
	
	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public void deleteBook(long parselong);

}
