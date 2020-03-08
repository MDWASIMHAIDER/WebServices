package com.nt.converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.nt.customer.Customer;

public class ResourceConverter {
	public static void main(String [] args) throws Exception{
		getAllCustomer();
	}
	
	public static void getAllCustomer() throws Exception{
		List<Customer>listCust=new ArrayList();
		ObjectMapper mapper=null;
		mapper=new ObjectMapper();
		Customer c1=new Customer(101, "wasim", "wasim@91",new Date());
		Customer c2=new Customer(102, "bharat", "bharat@91",new Date());
		/*Customer c3=new Customer(103, "rahul", "rahul@91");*/
	/*	Customer c1=new Customer();
		Customer c2=new Customer();*/
		Customer c3=new Customer();
		c3.setCid(103);c3.setCname("rahul");c3.setDate(new Date(10-8-2018));
		listCust.add(c1);
		listCust.add(c2);
		listCust.add(c3);
		String json=mapper.defaultPrettyPrintingWriter().writeValueAsString(listCust);
		//return listCust;
		System.out.println(json);
	}
}
