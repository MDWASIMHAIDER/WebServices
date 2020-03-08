package com.nt.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
//@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
public class MyCustomReader implements MessageBodyReader<CustomerDetail> {

	public MyCustomReader() {
		System.out.println("CustomReader called");
	}
	
	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		return CustomerDetail.class.isAssignableFrom(type);
		//return true
	}

	@Override
	public CustomerDetail readFrom(Class<CustomerDetail> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
			InputStreamReader isr=new InputStreamReader(entityStream);
			BufferedReader br=new BufferedReader(isr);
			String name=null;
			String email=null;
			String id=null;
			 name=br.readLine();
			 email=br.readLine();
			 id=br.readLine();
			CustomerDetail cd=new CustomerDetail();
			cd.setId(id);
			cd.setName(name);
			cd.setEmail(email);
			return cd;
	}

	
}
