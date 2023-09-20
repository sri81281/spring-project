package com.application.crud.crud.service;

import java.util.List;

import com.application.crud.crud.model.Employee;

public interface Service {

    public List<Employee> getEmployees();

    public Employee creatEmployee(Employee employee);

    public Employee updateEmployee(Employee Employee);

    public void removeEmployee(Long id);
}
