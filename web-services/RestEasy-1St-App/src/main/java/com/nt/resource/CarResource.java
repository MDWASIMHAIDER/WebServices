package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@Path("/car")
public class CarResource {
	
	public CarResource() {
		System.out.println("CarResource.CarResource()");
	}
	
	@GET
	@Path("/cardetail/{id}/{model}")
	@Produces(MediaType.TEXT_PLAIN)
//	@JsonSerialize(include=Inclusion.NON_NULL)
	public String setCarDetail(@PathParam("id")Integer id,
												@PathParam("model")String model,
												@MatrixParam("color")String color,
												@MatrixParam("location")String location){
		System.out.println(id+" "+model+" "+color+" "+location);
		return "Car Available";
		
	}
}
