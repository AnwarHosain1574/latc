package com.example.LATC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LATC.entity.EmployeeInformation;
import com.example.LATC.repository.EmployeeInformationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeInformationServiceImp implements EmployeeInformationService{

	@Autowired
	private EmployeeInformationRepository repo;
	
	@Override
	public EmployeeInformation save(EmployeeInformation entity) {
		return repo.save(entity);
	}

	@Override
	public EmployeeInformation update(EmployeeInformation entity) {
		return repo.save(entity);
	}

	@Override
	public EmployeeInformation delete(EmployeeInformation entity) {
		repo.delete(entity);
		return entity;
	}

	@Override
	public List<EmployeeInformation> getByMaritalStatus(String status) {
		return repo.findByMaritalStatus("M");
	}

	@Override
	public List<EmployeeInformation> getAll() {
		return repo.findAll();
	}
	
	

}
