package org.jsp.hibernate_mock.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skills {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int sid;
	private String sname;
	private String detail;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Employee employee;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Skills [sid=" + sid + ", sname=" + sname + ", detail=" + detail + ", employee=" + employee + "]";
	}
	
}
