package com.nt.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.nt.converter.XmlTOObj_ObjTOXml_Converter;
import com.nt.types.InvoiceType;
import com.nt.types.Invoicetype;

public class CompanyMarshaller {

	public static void main(String[] args) throws Exception {
	
		XmlTOObj_ObjTOXml_Converter converter=new XmlTOObj_ObjTOXml_Converter();
		converter.marshaller();
		converter.unMarshaller();
}

}