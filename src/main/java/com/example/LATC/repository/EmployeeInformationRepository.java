package com.example.LATC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LATC.entity.EmployeeInformation;

@Repository
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Integer>{
	
	List<EmployeeInformation> findByMaritalStatus(String status);

}
