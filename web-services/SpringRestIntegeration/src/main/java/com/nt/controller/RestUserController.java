package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.domain.RestUser;
import com.nt.service.RestUserService;

@RestController
public class RestUserController {
	
	public RestUserController() {
		System.out.println("RestController");
	}
	
	@Autowired
	private RestUserService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes= {"application/xml","application/json"})
	public @ResponseBody String addUser(@RequestBody RestUser user) {
		boolean res=service.add(user);
		if(res) {
			return "User Added Successfully";
		}
		else {
			return "User Not Added";
		}
	}
	
	@RequestMapping(value="/getuser", method=RequestMethod.GET,produces= {"application/json","application/xml"})
	public @ResponseBody RestUser getUser(@RequestParam(name="uid")String uid) {
		RestUser user=service.get(uid);
		return user;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT,consumes= {"application/json","application/xml"})
	public @ResponseBody String updatUser(@RequestParam("uid") String uid,@RequestBody RestUser user) {
		boolean res=service.update(uid, user);
		if(res) {
			return "user Updated successfully";
		}
		else {
			return "user not updated";
		}
	}

	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
public @ResponseBody String deleteUser(@RequestParam("uid")String uid) {
		boolean flag=service.delete(uid);
		if(flag) {
			return "User Deleted";
		}
	return "user not deleted";
}
}
