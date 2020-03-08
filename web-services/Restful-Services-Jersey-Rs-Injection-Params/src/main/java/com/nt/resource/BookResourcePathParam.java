package com.nt.resource;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/book")
public class BookResourcePathParam {
	
	public BookResourcePathParam() {
		System.out.println("book resource");
	}
	
	@GET
	@Path("{price}/{product}")
	public String bookPrice(@PathParam("price")Integer s,@PathParam("product")String p) {
		System.out.println("bookprice"+s);
		System.out.println("product name"+p);
		return s+p;
	}
	//here both method identified by its number of parameter
	//in pathparam param value is responsible for both method identification n invocation
	//here order of the param mandatory,,,@DefaultValue(value="bus") its not give any affect
	@GET
	@Path("{product}")
	public String bookDetail(@PathParam("product")String p) {
		System.out.println("product name"+p);
		return p;
	}
}
