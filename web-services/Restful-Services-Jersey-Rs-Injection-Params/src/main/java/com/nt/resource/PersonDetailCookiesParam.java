package com.nt.resource;

import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/cookie")
public class PersonDetailCookiesParam {
	
	/*@GET
	public Response createCookie(){
	    return Response
	            .ok("added")
	            .cookie(new NewCookie("name", "value"),new NewCookie("email", "wasim@91"),new NewCookie("address", "bihar"))
	            .build();
	}
	*/
	@GET
	//@Produces(MediaType.TEXT_PLAIN)
	public Response setCookies() {
		NewCookie c1=new NewCookie("name","wasim");
		NewCookie c2=new NewCookie("email","wasim.91@gmail");
		NewCookie c3=new NewCookie("address","bihar");
		Response.ResponseBuilder rb=Response.ok("Added Successfully").cookie(c1,c2,c3);
		Response response=rb.build();
		System.out.println(response);
		return response;
		//ResponseBuilder.Response.ok("cookies Added")
	}
	
	/*@GET
	@Path("/allcookie")
	//@Produces(MediaType.TEXT_PLAIN)
	public String getAllCookie(@Context HttpHeaders headers) {
	      Map<String, Cookie> cookies = headers.getCookies();
	      String str = cookies.entrySet()
	                          .stream()
	                          .map(e -> e.getKey() + " = " + e.getValue().getValue())
	                          .collect(Collectors.joining("<br/>"));
	      System.out.println(str);
	      return str;
		
	}*/
	
	/*@GET
	@Path("/allcookie")
	//@Produces(MediaType.TEXT_PLAIN)
	public String getAllCookie(@CookieParam("name")String name,@CookieParam("email")String email,@CookieParam("address")String address) {
	    return name+"<br> "+email+"<br> "+address;
	}*/
	
	@GET
	@Path("/allcookie")
	//@Produces(MediaType.TEXT_PLAIN)
	public String getAllCookie(@CookieParam("name")String name,@CookieParam("email")String email,@CookieParam("address")String address) {
	   System.out.println(name+" "+email+" "+address);
		return name+"<br> "+email+"<br> "+address;
	}
}
