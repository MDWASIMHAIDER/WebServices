package com.nt.resource;

import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

@Path("/headerparam")
public class HeaderDetails {
	
	@Context
	HttpHeaders headers;
	
	/*@GET
	public String getHeader(@HeaderParam("user-agent")String userAgent) {
		System.out.println(userAgent);
		return userAgent;
	}*/
	/*@GET
	public Response getHeader(@HeaderParam("user-agent")String userAgent) {
		System.out.println(userAgent);
		return Response.status(200).entity(userAgent).build();
	}
	*/
	@GET
	public String getHeader() {
		String userAgent=null;
				userAgent=headers.getRequestHeader("user-agent").get(0);
		System.out.println(userAgent);
		return userAgent;
	}
	
	@GET
	@Path("/allheaders")
	public String getAllHeaders() {
		MultivaluedMap<String, String>map=headers.getRequestHeaders();
		Set<String>set=null;
		set=map.keySet();
		for(String key:set) {
			List<String>listValue=headers.getRequestHeader(key);
			System.out.println("keys "+key);
		for(String value:listValue) {
			System.out.println(value);
		}
	}
		return "Succesfully Accessed";
	}
}
