package com.onerivet.services;

import java.util.List;

import com.onerivet.models.entity.Employee;
import com.onerivet.models.payload.EmployeeDto;

public interface EmployeeService {

	List<EmployeeDto> getAllEmployees();

}
