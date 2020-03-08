package com.nt.resource;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.TEXT_PLAIN)
public class MyCustomBodyWriter implements MessageBodyWriter<CustomerDetail> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		// TODO Auto-generated method stub
		//return CustomerDetail.class.isAssignableFrom(type);
		return CustomerDetail.class==type;
	}

	@Override
	public long getSize(CustomerDetail t, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public void writeTo(CustomerDetail t, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		Writer writer=null;
				writer=new PrintWriter(entityStream);
				writer.write(t.getId()+"\n");
				writer.write(t.getName()+"\n");
				writer.write(t.getEmail());
				writer.flush();
				writer.close();

}
}