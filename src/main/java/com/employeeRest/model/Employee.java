package com.employeeRest.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
@EqualsAndHashCode()
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "department_id")
    private Long department_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_bitrh")
    private String date_of_bitrh;

}
