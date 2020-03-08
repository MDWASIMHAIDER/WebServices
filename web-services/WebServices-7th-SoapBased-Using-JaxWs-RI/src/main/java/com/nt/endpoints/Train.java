package com.nt.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.request.binding.JourneyInfo;
import com.nt.request.binding.PassengerInfo;
import com.nt.response.binding.TicketInfo;

@WebService(name="Train")//endpoint
public interface Train {
	@WebMethod(operationName="processTicket")
	public @WebResult(name="TicketInfo") TicketInfo bookTicket(@WebParam(name="PassengerInfo") PassengerInfo pinfo,@WebParam(name="JourneyInfo") JourneyInfo jinfo);
}
