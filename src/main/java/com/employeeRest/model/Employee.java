package com.employeeRest.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

    public Employee(String first_name, String last_name, Long department_id, String job_title, String gender, String date_of_bitrh) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.department_id = department_id;
        this.job_title = job_title;
        this.gender = gender;
        this.date_of_bitrh = date_of_bitrh;
    }

    public Employee() {
    }


}
