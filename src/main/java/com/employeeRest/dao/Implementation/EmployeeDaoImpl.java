package com.employeeRest.dao.Implementation;

import com.employeeRest.dao.Mapper.EmployeeMapper;
import com.employeeRest.dao.interfaces.EmployeeDao;
import com.employeeRest.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public EmployeeDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int saveEmployee(Employee employee) {
        String sql = "INSERT INTO employees(first_name,last_name,department_id," +
                "job_title,date_of_bitrh,gender) VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,employee.getFirst_name(),employee.getLast_name()
                ,employee.getDepartment_id(),employee.getJob_title(),
                employee.getDate_of_birth_employee(),employee.getGender());
    }

    @Override
    public Employee getOne(Long idEmployee) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new EmployeeMapper(),idEmployee);
    }

    @Override
    public List<Employee> findAll() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql,new EmployeeMapper());
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = "UPDATE employees SET first_name = ?,last_name=?,department_id=?,job_title=?,date_of_bitrh=?,gender=? WHERE id = ?";
        return jdbcTemplate.update(sql,employee.getFirst_name(),employee.getLast_name(),employee.getDepartment_id(),
                employee.getJob_title(),employee.getDate_of_birth_employee(),employee.getGender(),employee.getId());
    }

    @Override
    public int deleteEmployeeById(Long idEmployee) {
        String sql = "DELETE FROM employees WHERE id = ?";
        return jdbcTemplate.update(sql,idEmployee);
    }
}
