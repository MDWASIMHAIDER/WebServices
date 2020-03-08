package com.nt.details;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="book")//endpoint 
public interface Book {
	@WebMethod 
	public @WebResult BookDetail getBoohByIsbno(@WebParam int isbn);
}
