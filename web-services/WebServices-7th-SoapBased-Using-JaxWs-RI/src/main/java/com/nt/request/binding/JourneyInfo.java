package com.nt.request.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="journey-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class JourneyInfo {
	@XmlElement(name="journey-date")
	private String journeyDate;
	@XmlElement(name="journey-source")
	private String journeySource; 
	@XmlElement(name="journy-destination")
	private String journeyDestination;
	@XmlElement(name="to-date")
	private String toDate;
	
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getJourneySource() {
		return journeySource;
	}
	public void setJourneySource(String journeySource) {
		this.journeySource = journeySource;
	}
	public String getJourneyDestination() {
		return journeyDestination;
	}
	public void setJourneyDestination(String journeyDestination) {
		this.journeyDestination = journeyDestination;
	}
	@Override
	public String toString() {
		return "JourneyInfo [journeyDate=" + journeyDate + ", journeySource=" + journeySource + ", journeyDestination="
				+ journeyDestination + "]";
	}
	
	
}
