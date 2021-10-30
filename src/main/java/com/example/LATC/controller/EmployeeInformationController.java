package com.example.LATC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LATC.entity.EmployeeInformation;
import com.example.LATC.service.EmployeeInformationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("employee-information")
public class EmployeeInformationController {

	@Autowired
	private EmployeeInformationService service;
	
	@PostMapping
	public EmployeeInformation save(@RequestBody EmployeeInformation entity) {
		System.out.println("Hit to the controller");
		System.out.println(entity.getEmployeeIdNumber());
		service.save(entity);
		return entity;
	}
	

}
