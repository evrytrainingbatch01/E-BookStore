package com.evry.ebookstore.service;

import java.util.List;
import java.util.Map;

import com.evry.ebookstore.model.BookEntity;

public interface BookService {
	
	public List<BookEntity> getAllBooks();

	public double buyBooks(List<Map<String, Object>> selectedBooks);

}
