package com.example.LATC.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		service.save(entity);
		return entity;
	}

	@PutMapping
	public EmployeeInformation update(@RequestBody EmployeeInformation entity) {
		service.update(entity);
		return entity;
	}

	@DeleteMapping
	public EmployeeInformation delete(@RequestBody EmployeeInformation entity) {
		service.delete(entity);
		return entity;
	}
	
	@GetMapping
	public List<EmployeeInformation> getAll() {
		return service.getAll();
	}

	
	@GetMapping( value = "get-by-marital-status/{maritalStatus}")
	public List<EmployeeInformation> getByMaritalStatus(@PathVariable("maritalStatus") String maritalStatus) {
		return service.getByMaritalStatus(maritalStatus);
	}
	

}
