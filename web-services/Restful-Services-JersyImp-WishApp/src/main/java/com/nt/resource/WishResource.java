package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;


@Path("/welcome")
public class WishResource {
	
	public WishResource() {
		System.out.println("WishResource Called");
	}
	//@GET
	@Path("/test")
	//@Produces(MediaType.APPLICATION_ATOM_XML)
	public String wishMessage(@QueryParam("id") Integer id) {
		return "<h1>Welcome to Resful Services!!!!</h1>"+id;
	}
}
