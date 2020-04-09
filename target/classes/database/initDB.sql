create  table IF NOT EXISTS departments(
                                          id serial primary key ,
                                          Department_Name varchar(256)
);
create table IF NOT EXISTS employees(
                                       id serial primary key,
                                       first_name varchar(256),
                                       last_name varchar(256),
                                       department_id int,
                                       job_title varchar(256),
                                       date_of_bitrh date,
                                       gender varchar(256),
                                       foreign key (department_id) references department(id) on delete cascade
);
