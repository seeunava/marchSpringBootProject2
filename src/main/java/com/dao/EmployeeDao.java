package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity,Integer>{

	Optional<EmployeeEntity> findByEmailIdAndPassword(String emailId, String password);
	                                 

	List<EmployeeEntity>  findAll();
	
	
	
	
	
	
}