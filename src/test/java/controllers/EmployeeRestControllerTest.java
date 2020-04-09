package controllers;

import com.employeeRest.config.AppConfig;
import com.employeeRest.model.Employee;
import com.employeeRest.rest.EmployeeRestController;
import com.employeeRest.service.interfaces.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@SpringBootTest
public class EmployeeRestControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeRestController restController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(restController)
                .build();
    }

    @Test
    public void getEmployeeById() throws Exception {
        Employee em = new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998");

        when(employeeService.getOne(10L)).thenReturn(em);

        mockMvc.perform(
                get("/api/employee/10")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(new ObjectMapper().writeValueAsString(em)))
                .andExpect(status().isOk());

        verify(employeeService, times(1)).getOne(10L);
        verifyNoMoreInteractions(employeeService);
     }

    @Test
    public void saveEmployee() throws Exception {
         MockHttpServletRequest request = new MockHttpServletRequest();
         RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

         when(employeeService.saveEmployee(any(Employee.class))).thenReturn(1);

         Employee employee = new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998");
         ResponseEntity<Employee> responseEntity = restController.saveEmployee(employee);

         int statusCodeValue = responseEntity.getStatusCodeValue();
         Assert.assertEquals(201,statusCodeValue);
     }

     @Test
    public void updateEmployee(){
         MockHttpServletRequest request = new MockHttpServletRequest();
         RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

         when(employeeService.updateEmployee(any(Employee.class))).thenReturn(1);

         Employee employee = new Employee("Jo","Aster",1L,"Godel","Man","12/03/1998");
         ResponseEntity<Employee> responseEntity = restController.updateEntity(employee,null);

         int statusCodeValue = responseEntity.getStatusCodeValue();
         Assert.assertEquals(200,statusCodeValue);
     }

}
