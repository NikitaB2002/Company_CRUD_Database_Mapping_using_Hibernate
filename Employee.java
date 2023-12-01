package org.jsp.hibernate_mock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int eid;
	private String ename;
	private double sal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Laptop laptop;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Skills> skills;


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	public double setupdateSal(double sal) {
		return this.sal = sal;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	
	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + ", company="
				+ company + "]";
	}
}
