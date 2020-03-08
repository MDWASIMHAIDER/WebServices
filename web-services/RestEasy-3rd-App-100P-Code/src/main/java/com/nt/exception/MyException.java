package com.nt.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyException implements ExceptionMapper<CustomWishException>{

	public MyException() {
		System.out.println("myException called");
	}
	@Override
	public Response toResponse(CustomWishException e) {
		return Response
		        .status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode())
		        .type(MediaType.TEXT_PLAIN)
		        .entity("Catching in ApplicaitonExceptionMapper : " + e.getMessage())
		        .build();
	}
	
		
}
