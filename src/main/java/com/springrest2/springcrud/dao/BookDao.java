package com.springrest2.springcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest2.springcrud.entities.Book;

public interface BookDao extends JpaRepository<Book,Long> {

}
