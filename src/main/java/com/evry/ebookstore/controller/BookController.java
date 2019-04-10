package com.evry.ebookstore.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evry.ebookstore.model.BookEntity;
import com.evry.ebookstore.service.BookService;

/**
 * 
 * @author venkata.kuppili
 *
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

	/** Injecting BookService classs into controller */
	@Autowired
	public BookService bookService;

	/**
	 * This method is used for get all the books info.
	 * 
	 * @return List<BookEntity>
	 */
	@GetMapping("/books")
	public List<BookEntity> getAllBooks() {
		return bookService.getAllBooks();
	}

	/**
	 * This method get the array of books and return total prise of the books.
	 * 
	 * @param books List<BookEntity>.
	 * @return price double.
	 */
	@GetMapping("/books/price")
	public double buyBooks(@RequestBody final List<Map<String, BookEntity>> books) {
		return bookService.byBooks(books);
	}

}
