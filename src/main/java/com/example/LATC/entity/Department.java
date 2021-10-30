package com.example.LATC.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "DEPARTMENT")
public class Department implements Serializable{
	

	private static final long serialVersionUID = 9132875688068247271L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String Name;

	@Column(name = "SHORT_NAME")
	private String shortName;
	
	@Column(name = "DEPARTMENT_ID")
	private String departmentId;


}
