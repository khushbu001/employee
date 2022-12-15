package com.employee.employeemanagement.entity;

import java.io.Serializable;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmpCommunicationMedia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empCommId;
	
	private String email1;
	
	private String email2;

	private String phoneNo1;
	
	private String phoneNo2;
	@OneToOne
	private Employee employee;

	public EmpCommunicationMedia() {
		super();
	}

	public EmpCommunicationMedia(Long empCommId, String email1, String email2, String phoneNo1, String phoneNo2,
			Employee employee) {
		super();
		this.empCommId = empCommId;
		this.email1 = email1;
		this.email2 = email2;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.employee = employee;
	}

	public Long getEmpCommId() {
		return empCommId;
	}

	public void setEmpCommId(Long empCommId) {
		this.empCommId = empCommId;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmpCommunicationMedia [empCommId=" + empCommId + ", email1=" + email1 + ", email2=" + email2
				+ ", phoneNo1=" + phoneNo1 + ", phoneNo2=" + phoneNo2 + ", employee=" + employee + "]";
	}

}
