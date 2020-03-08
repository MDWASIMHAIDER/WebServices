package com.nt.customer;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.nt.serializer.MySerializer;

import lombok.Data;

@Data
//for ordering the property
@JsonPropertyOrder({"customer-name","customer-email","customer-id"})
//just for not taking the proprties which are seted as null, will not be taken as object part which is null
@JsonSerialize(include=Inclusion.NON_NULL)
public class Customer {
	
	public Customer() {
		System.out.println("constructor called");
	}
	//for giving alternate name for the property
	@JsonProperty("customer-id")
	private int cid;
	@JsonProperty("customer-name")
	//just to simply ignore the property in object accessing
	//@JsonIgnore()
	private String cname;
	@JsonProperty("customer-email")
	private String email;
	
	@JsonProperty("customer-dob")
	@JsonSerialize(using = MySerializer.class)
	private Date date;
	public Customer(int cid, String cname, String email,Date date) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.date=date;
	}
	
	
}
