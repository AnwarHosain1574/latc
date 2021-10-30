package com.example.LATC.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "EMPLOYEE_INFORMATION")
public class EmployeeInformation implements Serializable{
	

	private static final long serialVersionUID = 9132875688068247271L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;

	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;

	@Column(name = "EMPLOYEE_ID_NUMBER")
	private String employeeIdNumber;

	@Column(name = "JOINING_DATE")
	private String joingDate;

	@Column(name = "FATHERS_NAME", length = 100, nullable = false)
	private String fathersName;
	
	@Column(name = "MARITAL_STATUS")
	private String maritalStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeIdNumber() {
		return employeeIdNumber;
	}

	public void setEmployeeIdNumber(String employeeIdNumber) {
		this.employeeIdNumber = employeeIdNumber;
	}

	public String getJoingDate() {
		return joingDate;
	}

	public void setJoingDate(String joingDate) {
		this.joingDate = joingDate;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
