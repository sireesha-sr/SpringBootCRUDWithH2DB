package com.developer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String employeeName;
	private String employeeAddress;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String employeeName, String employeeAddress) {
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}
