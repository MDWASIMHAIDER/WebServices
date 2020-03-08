package com.nt.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FlightHandler extends DefaultHandler{
	boolean id=false;
	boolean src=false;
	boolean dest=false;
	boolean bill=false;
	FlightTOObjTest flight;
	@Override
	public void startDocument() throws SAXException {
		flight=new FlightTOObjTest();
		System.out.println("*******Document Started********");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("flight-id")) {
			id=true;
		}
		if(qName.equals("flight-src")) {
			src=true;
		}
		 if(qName.equals("flight-dest")) {
			dest=true;
		}
		 if(qName.equals("bill-amt")) {
			 bill=true;
		 }
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(id) {
			flight.setFid(Integer.parseInt(new String(ch,start,length)));
			id=false;
		}
		if(src) {
			flight.setFsrc(new String(ch,start,length));
			src=false;
		}
		if(dest) {
			flight.setFdest(new String(ch,start,length));
			dest=false;
		}
		if(bill) {
			flight.setBill(new String(ch,start,length));
			bill=false;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
	}
	
	 @Override
	public void endDocument() throws SAXException {
		 System.out.println(flight);
		 System.out.println("*******Document Ended********");
	}
}
