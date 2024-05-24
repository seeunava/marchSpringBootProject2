package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;

	
	//registration
	
	@Override
	public void registerEmp(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
	
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		employeeDao.save(employeeEntity);
		
		//employeeDao.deleteById(emailId);  <-- for delete operation on the basis of emailId
	}


	@Override
	public EmployeeDTO authenticate(String emailId, String password) {
		Optional<EmployeeEntity> optional=employeeDao.findByEmailIdAndPassword(emailId,password);
		
		EmployeeDTO employeeDTO=null;
		
		if(optional.isPresent()) {
			//true
			EmployeeEntity employeeEntity=optional.get();
			
			employeeDTO=new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity,employeeDTO);
			
			return employeeDTO;   //not null
			
		}else {
			//false
			
			
			return employeeDTO;	//null
		}
		
		
		
		
		
		
		
	}


	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<EmployeeEntity> employeeEntity=employeeDao.findAll();
	
	List<EmployeeDTO>	employeeDtoList=new ArrayList<>();  //blank arrayList
		
		if(employeeEntity.size()>0) {
			
			for(EmployeeEntity     tempoVar:employeeEntity     ) {
				
				EmployeeDTO employeeDTO=new EmployeeDTO();
				
				BeanUtils.copyProperties(tempoVar,employeeDTO);
				
				
				employeeDtoList.add(employeeDTO);
			}
		
		}
	
		return employeeDtoList;
	}


	
	
	
	
	
	
	
	
}