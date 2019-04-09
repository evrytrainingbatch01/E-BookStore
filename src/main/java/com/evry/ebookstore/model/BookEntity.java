package com.evry.ebookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sadiq.ahamad
 * @author srinivas.pannur
 */
@Entity
@Table(name = "tbl_book")
public class BookEntity {

	@Id
	@Column(name = "book_id")
	private long bookId;
	@Column(name = "book_title")
	private String bookTitle;
	@Column(name = "book_author")
	private String bookAuthor;
	@Column(name = "book_publisher")
	private String bookPublisher;
	@Column(name = "book_info")
	private String bookInfo;
	@Column(name = "book_price")
	private double price;

	public BookEntity() {
		// TODO Auto-generated constructor stub
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}
