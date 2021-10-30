package com.example.LATC.service;

import java.util.List;

import com.example.LATC.entity.EmployeeInformation;

public interface EmployeeInformationService {
	EmployeeInformation save(EmployeeInformation entity);
	EmployeeInformation update(EmployeeInformation entity);
	EmployeeInformation delete(EmployeeInformation entity);
	List<EmployeeInformation > getByMaritalStatus(String status);
	List<EmployeeInformation > getAll();
}
