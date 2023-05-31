package com.onerivet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.models.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
