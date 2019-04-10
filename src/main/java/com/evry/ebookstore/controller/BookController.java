package com.evry.ebookstore.controller;

import java.util.List;
import java.util.Map;

import com.evry.ebookstore.model.BookEntity;

public interface BookController {
	public List<BookEntity> getAllBooks();

	public double buyBooks(final List<Map<String, BookEntity>> books);
}
