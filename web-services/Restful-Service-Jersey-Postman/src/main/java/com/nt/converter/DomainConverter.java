package com.nt.converter;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.domain.Book;


@Path("/book")
public class DomainConverter {
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Book findBook() {
		Book b=new Book();
		b.setBid(101);
		b.setBname("java");
		b.setPrice(230.9);
		return b;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String setBook(Book b) {
		System.out.println(b);
		return "obj added";
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String updateDetail(Book b) {
		System.out.println(b);
		return "Object Updated";
	}
	
	@DELETE
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String deleteObject(Book b) {
		System.out.println(b);
		return "Object deleted";
	}
}
