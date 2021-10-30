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
		System.out.println("Hit");
		return repo.save(entity);
	}

	@Override
	public EmployeeInformation update(EmployeeInformation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInformation delete(EmployeeInformation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeInformation> getByMaritalStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeInformation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
