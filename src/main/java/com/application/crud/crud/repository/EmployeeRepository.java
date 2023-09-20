package com.application.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.crud.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
