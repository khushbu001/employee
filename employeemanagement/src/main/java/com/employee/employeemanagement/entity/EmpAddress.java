package com.employee.employeemanagement.entity;

import java.io.Serializable;

import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empAddressId;
	
	private String addressline1;
	
	private String city;
	
	private String pinCode;
	
	private String landmark;
	
	private String state;
	
	private String country;

	@ManyToOne
	private Employee employee;

	public EmpAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpAddress(Long empAddressId, String addressline1, String city, String pinCode, String landmark,
			String state, String country, Employee employee) {
		super();
		this.empAddressId = empAddressId;
		this.addressline1 = addressline1;
		this.city = city;
		this.pinCode = pinCode;
		this.landmark = landmark;
		this.state = state;
		this.country = country;
		this.employee = employee;
	}

	public Long getEmpAddressId() {
		return empAddressId;
	}

	public void setEmpAddressId(Long empAddressId) {
		this.empAddressId = empAddressId;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmpAddress [empAddressId=" + empAddressId + ", addressline1=" + addressline1 + ", city=" + city
				+ ", pinCode=" + pinCode + ", landmark=" + landmark + ", state=" + state + ", country=" + country
				+ ", employee=" + employee + "]";
	}

}
