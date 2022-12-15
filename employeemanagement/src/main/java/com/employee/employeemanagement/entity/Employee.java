package com.employee.employeemanagement.entity;

import java.util.Set;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;

	private String name;

	private Integer age;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("employee")
	private Set<EmpFamily> empFamily;
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("employee")
	private Set<EmpAddress> empAddress;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("employee")
	private EmpCommunicationMedia comMedia;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long empId, String name, Integer age, Set<EmpFamily> empFamily, Set<EmpAddress> empAddress,
			EmpCommunicationMedia comMedia) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.empFamily = empFamily;
		this.empAddress = empAddress;
		this.comMedia = comMedia;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<EmpFamily> getEmpFamily() {
		return empFamily;
	}

	public void setEmpFamily(Set<EmpFamily> empFamily) {
		this.empFamily = empFamily;
	}

	public Set<EmpAddress> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<EmpAddress> empAddress) {
		this.empAddress = empAddress;
	}

	public EmpCommunicationMedia getComMedia() {
		return comMedia;
	}

	public void setComMedia(EmpCommunicationMedia comMedia) {
		this.comMedia = comMedia;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", empFamily=" + empFamily
				+ ", empAddress=" + empAddress + ", comMedia=" + comMedia + "]";
	}

}
