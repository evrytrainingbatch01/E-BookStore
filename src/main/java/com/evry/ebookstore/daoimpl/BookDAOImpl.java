package com.evry.ebookstore.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evry.ebookstore.dao.BookDAO;
import com.evry.ebookstore.model.BookEntity;

/**
 * 
 * @author deepak.ja
 *
 */

@Repository
public class BookDAOImpl{

	@Autowired
	private BookDAO bookDAO;
	
	// get all books
	public List<BookEntity> getAllBooks(){
		List<BookEntity> allBooks = bookDAO.findAll();
		return allBooks;
	}
	
	// get book by id
	public BookEntity getBookById(long id) {
		BookEntity book = bookDAO.findById(id).get();
		return book;
	}
	
}
