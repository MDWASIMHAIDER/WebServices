package com.nt.domparser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserFirstProg{
	
	public static void main(String[] args) throws Exception{
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document doc=builder.parse("flight.xml");
	Element rootelement=doc.getDocumentElement();
	System.out.println(" root elements--> "+rootelement.getNodeName());
	NodeList nodelist=rootelement.getElementsByTagName("international-flight");
	if(nodelist!=null) {
		for(int i=0;i<nodelist.getLength();i++) {
			Node node=nodelist.item(i);
			if(node.getNodeType()==Document.ELEMENT_NODE) {
				Element ele=(Element) node;
				System.out.println("itemCode "+ele.getElementsByTagName("flight-id").item(0).getTextContent()+" "+ele.getTagName());
				System.out.println("itemCode "+ele.getElementsByTagName("flight-src").item(0).getTextContent()+" "+ele.getNodeName());
				System.out.println("itemCode "+ele.getElementsByTagName("flight-dest").item(0).getTextContent()+" "+ele.getNodeName());
				System.out.println("itemCode "+ele.getElementsByTagName("bill-amt").item(0).getTextContent()+" "+ele.getNodeName());
				
			}
		}
	}
	}
}
