package com.application.crud.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.crud.crud.model.Employee;
import com.application.crud.crud.repository.EmployeeRepository;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service {
    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee creatEmployee(Employee employee) {

        return repository.save(employee);

    }

    @Override
    public Employee updateEmployee(Employee employee) {

        Optional<Employee> employeedata = repository.findById(employee.getId());
        if (employeedata.isPresent()) {
            Employee updatedata = employeedata.get();
            updatedata.setAge(employee.getAge());
            updatedata.setName(employee.getName());
            updatedata.setId(employee.getId());
            return repository.save(updatedata);
        } else {
            return null;
        }
    }

    @Override
    public void removeEmployee(Long id) {

        Optional<Employee> employeedata = repository.findById(id);
        if (employeedata.isPresent()) {

            repository.deleteById(id);
        }

    }

}
