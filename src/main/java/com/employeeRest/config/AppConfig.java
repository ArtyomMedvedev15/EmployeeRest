package com.employeeRest.config;
import com.employeeRest.dao.Implementation.EmployeeDaoImpl;
import com.employeeRest.dao.interfaces.EmployeeDao;
import com.employeeRest.service.interfaces.EmployeeService;
import com.employeeRest.service.implementation.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/DEmploye");
        dataSource.setUsername("postgres");
        dataSource.setPassword("1234");
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }

    @Bean
    public EmployeeDao getEmployeeImpl(){
        return new EmployeeDaoImpl(getDataSource());
    }

    @Bean
    public EmployeeService getEmployeeSericeImpl(){return new EmployeeServiceImpl();}

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

     }

}

