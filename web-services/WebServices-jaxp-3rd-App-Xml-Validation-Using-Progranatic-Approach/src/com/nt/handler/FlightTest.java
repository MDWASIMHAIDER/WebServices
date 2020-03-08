package com.nt.handler;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class FlightTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory=null;
		factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		parser.parse(new File("flight.xml"), new FlightHandler());
		boolean status=validateXml();
		if(status) {
			System.out.println("xml is valid");
		}
		else {
			System.out.println("xml is invalid");
		}
		
	}
	public static boolean validateXml(){
		try {
		SchemaFactory factory=null;
		factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=factory.newSchema(new File("flightXsd.xsd"));
		Validator validator=schema.newValidator();
		validator.validate(new StreamSource("flight.xml"));
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
