package com.employeeRest.service.interfaces;

import com.employeeRest.model.Employee;

import java.util.List;

public interface EmployeeService {
    int saveEmployee(Employee employee);

    Employee getOne(Long idEmployee);

    List<Employee> findAll();

    int updateEmployee(Employee employee);

    int deleteEmployeeById(Long idEmployee);
}
