package com.nt.beans;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


import com.nt.types.InvoiceType;

public class CompanyMarshaller {

	public static void main(String[] args) throws Exception {
	
		InvoiceType invoice=new InvoiceType();
		invoice.setInvoiceId(1002);
		invoice.setName("bharat");
		invoice.setAddress("bhagalpur");
		
		JAXBContext context=JAXBContext.newInstance(InvoiceType.class);
		Marshaller marshaler=context.createMarshaller(); 
		marshaler.marshal(invoice, System.out);
	//	marshaler.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
		}

}
