package com.employee.employeemanagement.entity;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpFamily {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empFamilyId;
	
	private String name;
	
	private Integer age;
	
	private String relation;

	@ManyToOne
	private Employee employee;

	public EmpFamily() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpFamily(Long empFamilyId, String name, Integer age, String relation, Employee employee) {
		super();
		this.empFamilyId = empFamilyId;
		this.name = name;
		this.age = age;
		this.relation = relation;
		this.employee = employee;
	}

	public Long getEmpFamilyId() {
		return empFamilyId;
	}

	public void setEmpFamilyId(Long empFamilyId) {
		this.empFamilyId = empFamilyId;
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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmpFamily [empFamilyId=" + empFamilyId + ", name=" + name + ", age=" + age + ", relation=" + relation
				+ ", employee=" + employee + "]";
	}

	
}
