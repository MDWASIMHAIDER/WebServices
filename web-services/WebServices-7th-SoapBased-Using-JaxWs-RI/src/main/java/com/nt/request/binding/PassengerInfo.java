package com.nt.request.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="passenger-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class PassengerInfo {
	private String name;
	private String age;
	@XmlElement(name="pan-number")
	private String panNumber;
	@XmlElement(name="aadhar-number")
	private long aadharNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "PassengerInfo [name=" + name + ", age=" + age + ", panNumber=" + panNumber + ", aadharNumber="
				+ aadharNumber + "]";
	}
	
}
