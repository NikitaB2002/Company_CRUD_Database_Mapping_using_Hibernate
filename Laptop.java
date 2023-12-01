package org.jsp.hibernate_mock.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int lid;
	private String brand;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "laptop")
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price +  "]";
	}
	
	
}
