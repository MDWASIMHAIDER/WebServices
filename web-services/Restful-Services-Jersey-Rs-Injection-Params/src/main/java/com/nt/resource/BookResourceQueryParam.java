package com.nt.resource;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.nt.binder.PersonDetail;

@Path("/bresource")
public class BookResourceQueryParam {
	
	@Context 
	private UriInfo info;
	
	public BookResourceQueryParam() {
		System.out.println("BookResourceQueryParam-constructor");
	}
	
	@GET
	public String getBookPrice(@DefaultValue(value="250") @QueryParam("price")  Integer price) {
		System.out.println("query param book price");
		MultivaluedMap<String,String>map=info.getQueryParameters();
		List<String>list=map.get("price");
		System.out.println(list);
		return "book price: "+price;
	}
	
	@GET
	@Path("/detail")
	public String getBooDetail(@QueryParam("name") String name,@QueryParam("author")String author) {
		System.out.println("query param book price");
		return "book Detail: "+name+"  "+author;
	}
	
}
