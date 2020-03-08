package com.nt.details;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement(name="book-detail")
public class BookDetail {
	//@XmlElement(name="book-id")
	private int bookId;
	//@XmlElement(name="book-name")
	private String bookName;
	//@XmlElement(name="book-price")
	private double bookPrice;
	//@XmlElement(name="isbn-no")
	private int isbn;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
}
