package com.codemage.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemage.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
