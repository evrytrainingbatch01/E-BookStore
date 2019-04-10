package com.evry.ebookstore.serviceimpl;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.evry.ebookstore.dao.BookDAO;
import com.evry.ebookstore.model.BookEntity;
import com.evry.ebookstore.service.BookService;

/**
 * 
 * @author srinivasa.nayana
 * @author manoj.kulakarni class BookServiceImpl implementing the interface
 *         BookService to implement the methods.
 *
 */
@Service
public class BookServiceImpl implements BookService {

	/**
	 * Below statement is to have BookDAOImpl object injected into BookServiceImpl
	 * class by spring container implicitly. this is achieved by @Autowired
	 * annotation
	 */
	@Autowired
	private BookDAO bookDao;

	/**
	 * @getAllBooks() method is used here to get the list of books by calling
	 *                getAllBooks() of BookDAOImpl class of Dao layer.
	 * @return List<BookEntity> (list of objects of BookEntity type)
	 */

	@Override
	public List<BookEntity> getAllBooks() {

		return bookDao.getAllBooks();
	}

	/**
	 * @buyBooks method is used here using selectedBooks {@value bookId } to get
	 *           single bookPrice by calling buyBooks() of BookDAOImpl class of Dao
	 *           layer and multiple with {@value bookQuantity },the total price
	 *           saved in @return TolalPrice in double.
	 * 
	 */

	@Override
	public double buyBooks(List<Map<String, Object>> selectedBooks) {

		double TolalPrice = 0;
		for (Map<String, Object> map : selectedBooks) {
			BookEntity bookInfo = getAllBookById(Long.parseLong(map.get("bookId").toString()));
			TolalPrice += bookInfo.getPrice() * Integer.parseInt(map.get("bookQuantity").toString());
		}

		return TolalPrice;
	}
/**
 * This method get the book Object 
 * @param id
 * @return BookEntity 
 */
	private BookEntity getAllBookById(long id) {

		return bookDao.getAllBookById(id);
	}

}
