package com.nt.coverter1;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nt.customer.Customer;

public class ConvertJsonToJavaObject {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper=null;
		mapper=new ObjectMapper();
		File file=null;
		file=new File("jsonfile.json");
		Customer c=mapper.readValue(file,Customer.class);
		System.out.println(c);
	}
}
