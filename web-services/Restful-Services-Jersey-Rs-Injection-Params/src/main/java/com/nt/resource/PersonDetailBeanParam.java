package com.nt.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nt.binder.PersonDetail;

@Path("/bparam")
public class PersonDetailBeanParam {

	@POST
	@Path("/publicdetail")
	public String publicDetail(@BeanParam PersonDetail pd) {
		System.out.println("Person Detail-->"+pd);
		return "Person Details Added Successfully";
	}
}
