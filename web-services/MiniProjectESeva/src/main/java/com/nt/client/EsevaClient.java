package com.nt.client;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RestController;

@Path("/eclient")
public class EsevaClient {
	public EsevaClient() {
		System.out.println("client");
	}
}
