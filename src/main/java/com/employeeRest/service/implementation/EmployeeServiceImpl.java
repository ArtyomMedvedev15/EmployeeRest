package com.employeeRest.service.implementation;

import com.employeeRest.dao.interfaces.EmployeeDao;
import com.employeeRest.model.Employee;
import com.employeeRest.service.interfaces.EmployeeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = Logger.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public int saveEmployee(Employee employee) {
        log.info("Save employee " + employee.toString());
        return employeeDao.saveEmployee(employee);
    }

    @Override
    public Employee getOne(Long idEmployee) {
        log.info("Get employee by id - " + idEmployee );
        return employeeDao.getOne(idEmployee);
    }

    @Override
    public List<Employee> findAll() {
        log.info("Find all employee");
        return employeeDao.findAll();
    }

    @Override
    public int updateEmployee(Employee employee) {
        log.info("Update employee " + employee.toString());
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(Long idEmployee) {
        log.info("Delete employee - " + idEmployee);
        return employeeDao.deleteEmployeeById(idEmployee);
    }
}
