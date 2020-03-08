package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/*@WebService(endpointInterface="com.nt.service.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public Integer add(Integer a, Integer b) {
		return a+b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}

}*/
@WebService(name="Calculator")//both the code work same one is using interface another one not
public class CalculatorImpl {

	
	@WebMethod
	public @WebResult Integer add(@WebParam Integer a, @WebParam Integer b) {
		return a+b;
	}

	@WebMethod
	public @WebResult Integer sub(@WebParam Integer a, @WebParam Integer b) {
		return a-b;
	}
}