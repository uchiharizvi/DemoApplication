package com.example.demo.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String deptName;

    protected Employee() {
    }

    public Employee(String firstName, String lastName, String deptName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%d, firstName='%s', lastName='%s', deptName='%s']",
                id, firstName, lastName, deptName);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getDeptName() {
        return deptName;
    }

}
