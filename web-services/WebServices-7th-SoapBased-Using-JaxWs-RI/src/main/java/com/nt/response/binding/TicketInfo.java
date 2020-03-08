package com.nt.response.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ticket-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class TicketInfo {
	@XmlElement(name="ticket-id")
	private long ticketId;
	@XmlElement(name="from-date")
	private String fromDate;
	@XmlElement(name="to-date")
	private String toDate;
	@XmlElement(name="ticket-fare")
	private String ticketFare;
	@XmlElement(name="train-number")
	private String trainNumber;
	@XmlElement(name="ticket-status")
	private String ticketStatus;
	@XmlElement(name="journey-source")
	private String journeySource;
	@XmlElement(name="journey-destination")
	
	private String journeyDestionation;
	public String getJourneySource() {
		return journeySource;
	}
	public void setJourneySource(String journeySource) {
		this.journeySource = journeySource;
	}
	public String getJourneyDestionation() {
		return journeyDestionation;
	}
	public void setJourneyDestionation(String journeyDestionation) {
		this.journeyDestionation = journeyDestionation;
	}
	public long getTicketId() {
		return ticketId;
	}
	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(String ticketFare) {
		this.ticketFare = ticketFare;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "TicketInfo [ticketId=" + ticketId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", ticketFare="
				+ ticketFare + ", trainNumber=" + trainNumber + ", ticketStatus=" + ticketStatus + "]";
	}
	
	
}
