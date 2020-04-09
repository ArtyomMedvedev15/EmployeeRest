package com.employeeRest.service.implementation;


import com.employeeRest.config.AppConfig;
import com.employeeRest.dao.interfaces.EmployeeDao;
import com.employeeRest.model.Employee;
import com.employeeRest.service.interfaces.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeDao employeeDao;


   @Test
    public void saveEmployee() {
         when(employeeDao.saveEmployee(new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998"))).thenReturn(1);
        assertEquals(1,employeeService.saveEmployee(new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998")));
    }

   @Test
    public void getOne() {
       when(employeeDao.getOne(1L)).thenReturn(new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998"));
       assertEquals("Jo",employeeService.getOne(1L).getFirst_name());
    }

    @Test
    public void findAll() {
       when(employeeDao.findAll()).thenReturn(Stream.of(new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998"),new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998")).collect(Collectors.toList()));
       assertEquals(2,employeeService.findAll().size());
   }

    @Test
    public void updateEmployee() {
       when(employeeDao.updateEmployee(new Employee("Jos","Aster",1L,"Godel","Man","12/03/1998"))).thenReturn(1);
       assertEquals(1,employeeService.updateEmployee(new Employee("Jos","Aster",1L,"Godel","Man","12/03/1998")));
    }

    @Test
    public void deleteEmployeeById() {
       when(employeeDao.deleteEmployeeById(1L)).thenReturn(1);
       assertEquals(1,employeeService.deleteEmployeeById(1L));
    }
}
