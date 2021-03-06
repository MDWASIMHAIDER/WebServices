package com.nt.resource;

import javax.inject.Singleton;
import javax.ws.rs.FormParam;

@Singleton
public class CustomerDetail {

	public CustomerDetail() {
		System.out.println("CustomerDetail ");
	}
	private String name;
	private String email;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CustomerDetail [name=" + name + ", email=" + email + ", id=" + id + "]";
	}
	
}
