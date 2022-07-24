package com.springrest2.springcrud.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest2.springcrud.dao.BookDao;
import com.springrest2.springcrud.entities.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

//	List<Book> list;
	
	public BookServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Book(22,"Complete Java","You can learn complete core java"));
//		list.add(new Book(23,"Complete Python","You can learn complete Python"));
//		
//		
	}
	
	@Override
	public List<Book> getBooks() {
		
		
		
		
		return bookDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Book getBook(long bookId) {
//		Book b=null;
//		for(Book book:list)
//		{
//			if(book.getId()==bookId)
//			{
//				b=book;
//				break;
//			}
//			

		
		
		return bookDao.getOne(bookId);
	}

	@Override
	public Book addBook(Book book)
	{
 //     list.add(book);
		bookDao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		
//      list.forEach(e ->{
//    	  if (e.getId()==book.getId()) {
//    		  e.setTital(book.getTital());
//    		  e.setDescription(book.getDescription());
//    	  }
//    	  
//    	  
//      });
		
		bookDao.save(book);
		
		return book;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteBook(long parselong) {
//		list=this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
		
	Book entity =bookDao.getOne(parselong);
	bookDao.delete(entity);
		
	}

}
