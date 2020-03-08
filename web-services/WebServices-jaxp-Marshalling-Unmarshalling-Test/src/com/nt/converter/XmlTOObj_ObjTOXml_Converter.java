package com.nt.converter;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.nt.types.Invoicetype;

public class XmlTOObj_ObjTOXml_Converter {
	
	public void marshaller() throws Exception {
		Invoicetype invoice=new Invoicetype();
		invoice.setInvoiceId(2001);
		invoice.setCustomerName("wasim");
		List<String>productlist=invoice.getProduct();
		productlist.add("milk");
		productlist.add("chocolate");
		invoice.setAmount(2310);
		JAXBContext jcontext=JAXBContext.newInstance(Invoicetype.class);
		Marshaller ms=jcontext.createMarshaller();
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(invoice,System.out);
		ms.marshal(invoice,new File("src/invoice.xml"));
		
	}
	public void unMarshaller() throws Exception {
		JAXBContext jcontext=JAXBContext.newInstance(Invoicetype.class);
		Unmarshaller ums=jcontext.createUnmarshaller();
		Invoicetype invoice=(Invoicetype) ums.unmarshal(new File("invoice.xml"));
	/*	System.out.println(invoice.getInvoiceId());
		System.out.println(invoice.getCustomerName());
		System.out.println(invoice.getProduct());
		System.out.println(invoice.getAmount());*/
		System.out.println(invoice);
	}
}
