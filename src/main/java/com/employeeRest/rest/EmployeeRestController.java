package com.employeeRest.rest;

import com.employeeRest.model.Employee;
import com.employeeRest.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long idEmployee, @PathVariable Long id){
        if(idEmployee==null){
            return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
        }

        Employee employee = employeeService.getOne(idEmployee);

        if(employee==null){
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Employee>(employee,HttpStatus.OK);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid Employee employee){
        HttpHeaders httpHeaders = new HttpHeaders();

        if(employee == null){
            return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
        }

        employeeService.saveEmployee(employee);

        return new ResponseEntity<Employee>(employee,httpHeaders,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Employee>updateEntity(@RequestBody @Valid Employee employee, UriComponentsBuilder uriComponentsBuilder){
        HttpHeaders httpHeaders = new HttpHeaders();
        if(employee == null){
            return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
        }

        employeeService.updateEmployee(employee);

        return new ResponseEntity<Employee>(employee,httpHeaders,HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Employee>deleteEmployee(@PathVariable("id") Long id){
        Employee employee = employeeService.getOne(id);

        if(employee==null){
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

        employeeService.deleteEmployeeById(id);

        return new ResponseEntity<Employee>(employee,HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Employee>>getAllEmployee(){
        List<Employee>employees = employeeService.findAll();

        if(employees.isEmpty()){
            return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
    }

}
