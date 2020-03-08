package com.nt.webservices;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultServiceHandler extends DefaultHandler{
	boolean id=false;
	boolean name=false;
	boolean aname=false;
	boolean address=false;
	private int bookId;
	@Override
	public void startDocument() throws SAXException{
		super.startDocument();
		System.out.println("Document started");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Start element: "+qName);
		if(qName.equalsIgnoreCase("book-id")) {
			id=true;
		}
		 if(qName.equalsIgnoreCase("book-name")) {
			name=true;
		}
		 if(qName.equalsIgnoreCase("author-name")) {
			 aname=true;
		 }
		 if(qName.equalsIgnoreCase("author-address")) {
			 address=true;
		 }
		 if(qName.equalsIgnoreCase("book")) {
			 System.out.println("Attribute: "+attributes.getValue("type"));
		//	 bookAttribute=attributes.getValue("type");
			// System.out.println(bookAttribute+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		 }
		 if(qName.equalsIgnoreCase("author")) {
			 System.out.println("Author Attribute "+attributes.getValue("degree"));
			// authorAttribute=attributes.getValue("degree");
		 }
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(id) {
			System.out.println("Character: "+new String(ch,start,length));
		//	bookId=Integer.parseInt(new String(ch,start,length));
			id=false;
		}
		if(name) {
			System.out.println("Character:"+new String(ch,start,length));
		//	bookName=new String(ch,start,length);
		//	System.out.println(bookName+",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
			name=false;
		}
		if(address) {
			System.out.println("Character: "+new String(ch,start,length));
		//	authorAddress=new String(ch,start,length);
			address=false;
		}
		if(aname) {
			System.out.println("Character :"+new String(ch,start,length));
			//authorName=new String(ch,start,length);
			aname=false;
		}		
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("Close element: "+qName);
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("End document");
	}
}
