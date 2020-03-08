package com.nt.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FlightHandler  extends DefaultHandler{
	private boolean id=false;
	private boolean src=false;
	private boolean dest=false;
	private boolean amt=false;
	private FlightDetail detail;
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("*******Document Started*********");
		detail=new FlightDetail();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	//	System.out.println("Element Started");
	
		if(qName.equals("flight-id")) {
			id=true;
		}
		else if(qName.equals("flight-src")) {
			src=true;
		}
		else if(qName.equals("flight-dest")) {
			dest=true;
		}
		else if(qName.equals("bill-amt")) {
			amt=true;
		}
	}
	
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(id) {
			int fid=(Integer.parseInt(new String(ch,start,length)));
			detail.setFid(fid);
			id=false;
		}
		if(src) {
			String fsrc=new String(ch,start,length);
			detail.setfSource(fsrc);
			src=false;
		}
		if(dest) {
			String fdest=new String(ch, start, length);
			detail.setfDest(fdest);
			dest=false;
		}
		if(amt) {
			float famt=Float.parseFloat(new String(ch, start, length));
			detail.setBillAmt(famt);
			amt=false;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("Element Ended");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println(detail);
		System.out.println("*******Document Ended**********");
		
	}
}
