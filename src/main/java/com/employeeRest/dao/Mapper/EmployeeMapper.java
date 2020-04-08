package com.employeeRest.dao.Mapper;

import com.employeeRest.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getLong("id"));
        employee.setFirst_name(resultSet.getString("first_name"));
        employee.setLast_name(resultSet.getString("last_name"));
        employee.setDepartment_id(resultSet.getLong("department_id"));
        employee.setJob_title(resultSet.getString("job_title"));
        employee.setGender(resultSet.getString("gender"));
        employee.setDate_of_birth_employee(resultSet.getDate("date_of_bitrh"));
        return employee;
    }
}
