package com.nt.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.Provider;

import com.nt.exception.MyException;
import com.nt.resources.WishMessage;

@ApplicationPath("/rest/*")
public class ApplicationClass extends Application{
	
	public ApplicationClass() {
		System.out.println("ApplicationClass Called");
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		 Set<Class<?>> s = new HashSet<Class<?>>();
	        s.add(WishMessage.class);
	        s.add(MyException.class);
	        return s;
	}
}
