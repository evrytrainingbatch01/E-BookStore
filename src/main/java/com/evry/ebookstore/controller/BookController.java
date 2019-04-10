package com.evry.ebookstore.controller;

import java.util.List;

import com.evry.ebookstore.model.BookEntity;

/**
 * 
 * @author venkata.kuppili
 *
 */
public interface BookController {
	/**
	 * This method is used for get all the books info.
	 * 
	 * @return List<BookEntity>
	 */
	public List<BookEntity> getAllBooks();

	/**
	 * This method get the array of books and return total prise of the books.
	 * 
	 * @param books    List<BookEntity>.
	 * @param quantity
	 * @return price double.
	 */
	public double buyBooks(final List<BookEntity> books, final int quantity);
}
