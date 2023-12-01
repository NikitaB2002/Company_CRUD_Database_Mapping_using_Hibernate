package org.jsp.hibernate_mock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int cid;
	private String cname;
	private String logo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Employee> employee;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Laptop> laptop;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}



	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", logo=" + logo + ", address=" + address +  "]";
	}
	
	
}
