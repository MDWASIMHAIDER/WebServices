package com.nt.endpoints;

import java.util.Random;

import javax.jws.WebService;

import com.nt.request.binding.JourneyInfo;
import com.nt.request.binding.PassengerInfo;
import com.nt.response.binding.TicketInfo;

@WebService(endpointInterface="com.nt.endpoints.Train")
public class TrainImpl implements Train {

	@Override
	public TicketInfo bookTicket(PassengerInfo pinfo, JourneyInfo jinfo) {
		TicketInfo tc=new TicketInfo();
		Random rad=new Random();
		int num=rad.nextInt(1000);
		tc.setTicketId(num);
		tc.setFromDate(jinfo.getJourneyDate());
		tc.setToDate(jinfo.getToDate());
		tc.setTrainNumber("A12340");
		tc.setTicketFare("1250.00 INR");
		tc.setTicketStatus("Running");
		tc.setJourneySource(jinfo.getJourneySource());
		tc.setJourneyDestionation(jinfo.getJourneyDestination());
		return tc;
	}

}
