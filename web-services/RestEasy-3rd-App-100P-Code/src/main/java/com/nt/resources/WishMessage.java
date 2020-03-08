package com.nt.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nt.exception.CustomWishException;

@Path("/wish")
public class WishMessage {
	
	@GET
	public String wishMessage() throws CustomWishException {
		try {
			int res=0;
			res=10/0;
		}
		catch (Exception e) {
			throw new CustomWishException("internal problem",e.getMessage());
		}
		
		return "Good morning";
	}
}
