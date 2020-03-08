package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="Calculator")//endpoint interface
public interface Calculator {
	
	@WebMethod
	public @WebResult Integer add(@WebParam Integer a,@WebParam Integer b);
	
	@WebMethod
	public @WebResult Integer sub(@WebParam Integer a,@WebParam Integer b);
}
