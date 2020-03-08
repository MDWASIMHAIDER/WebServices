package com.nt.command;

import lombok.Data;

@Data
public class PassportCommand {
	
	private String pholderName;
	private String pholderAddress;
	private String fatherName;
	private String maritialStatus;
	private int birthId;
	private long phone;
	private String criminalRecord;
	private String profession;
}
