package com.nt.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nt.binder.PersonDetail;

@Path("/formdetail")
public class PersonDetailFormParam {
	public PersonDetailFormParam() {
		System.out.println("PersonDetailFormParam.PersonDetailFormParam()-Constructor");
	}
	
	@POST
	public String formDetail(@FormParam("uname")String uname,@FormParam("pwd")String pwd,@FormParam("email")String email) {
		System.out.println(uname+" "+pwd+" "+email);
		return "User-Name "+uname+"  Password "+pwd+"  Email "+email;
	}
}
