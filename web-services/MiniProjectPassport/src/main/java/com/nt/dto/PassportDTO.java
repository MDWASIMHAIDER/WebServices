package com.nt.dto;

import lombok.Data;

@Data
public class PassportDTO {
	
	private String pholderName;
	private String pholderAddress;
	private String fatherName;
	private String maritialStatus;
	private int birthId;
	private long phone;
	private String criminalRecord;
	private String profession;
}
