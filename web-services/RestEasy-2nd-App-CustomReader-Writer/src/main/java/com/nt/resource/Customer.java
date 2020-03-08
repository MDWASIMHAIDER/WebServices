package com.nt.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/cust")
public class Customer {
	
	public Customer() {
		System.out.println("constructor");
	}
	
	/*@GET
	@Path("{name}")
	@Produces(MediaType.TEXT_HTML)
	public String getCustomer(@PathParam("name")String name){
		return "Got The name "+name;
	}*/
	
	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_PLAIN)
	public CustomerDetail getCustomer(){
		CustomerDetail c=new CustomerDetail();
		c.setId("101");
		c.setName("wasim");
		c.setEmail("wasim.haider91.gamil");
		System.out.println(c);
		return c;
		//return Response.ok(c).build();
	}
	
	@POST
	@Path("/post")
	@Consumes({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
	//@Produces(MediaType.APPLICATION_JSON)
	public Response addCustomer(CustomerDetail cd) {
		String result = "Product created : " + cd;
		System.out.println("addCustomer Called");
		//return Response.status(200).entity(result).build();
		// Response r=Response.ok("added").build();
		return Response.ok(cd).build();
		//return "added";
	}
}
