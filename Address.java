package org.jsp.hibernate_mock.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int aid;
	private String city;
	private long Pincode;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return Pincode;
	}
	public void setPincode(long pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", Pincode=" + Pincode + "]";
	}
	
	
}
