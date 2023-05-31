package com.onerivet.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.models.entity.Employee;
import com.onerivet.models.payload.EmployeeDto;
import com.onerivet.repository.EmployeeRepo;
import com.onerivet.services.EmployeeService;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
	
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<EmployeeDto> getAllEmployees() {
//		List<Employee> findAll = this.employeeRepo.findAll();
//		System.out.println(findAll);
//		
//		return findAll;
		return this.employeeRepo.findAll().stream().map((employee) -> this.modelMapper.map(employee, EmployeeDto.class)).collect(Collectors.toList()) ;
	}

}
