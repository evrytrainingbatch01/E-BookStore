package com.evry.ebookstore.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evry.ebookstore.dao.BookDAO;
import com.evry.ebookstore.model.BookEntity;
import com.evry.ebookstore.service.BookService;

/**
 * 
 * @author srinivasa.nayana
 * 
 * class BookServiceImpl implementing the interface BookService to implement the methods.
 *
 */
@Service
public class BookServiceImpl implements BookService{

	/**
	 * Below statement is to have BookDAOImpl object injected into BookServiceImpl class by spring container implicitly.
	 * this is achieved by @Autowired annotation 
	 */
	@Autowired
	private BookDAO bookDao;
	
	
	/**
	 * @getAllBooks() method is used here to get the list of books by calling getAllBooks() of BookDAOImpl class of Dao layer.
	 * @return List<BookEntity> (list of objects of BookEntity type) 
	 */
	public List<BookEntity> getAllBooks() {
		
		return bookDao.getAllBooks();
	}
	


}
