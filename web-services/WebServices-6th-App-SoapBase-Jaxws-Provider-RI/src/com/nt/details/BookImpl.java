package com.nt.details;

import javax.jws.WebService;

@WebService(endpointInterface="com.nt.details.Book")
public class BookImpl implements Book {

	@Override
	public BookDetail getBoohByIsbno(int isbn) {
		BookDetail detail=new BookDetail();
		detail.setBookId(1001);
		detail.setBookName("java");
		detail.setBookPrice(250.00);
		detail.setIsbn(isbn);
		return detail;
	}

}
