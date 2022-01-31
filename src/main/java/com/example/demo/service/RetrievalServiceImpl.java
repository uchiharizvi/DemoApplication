package com.example.demo.service;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RetrievalServiceImpl implements RetrievalService {
    @Autowired
    EmployeeRepository repository;

    public Employee getEmployeeDetail(Long id) throws Exception {

        return repository.findById(id);
    }

    public Iterable<Employee> getAllEmployees() throws Exception {
        return repository.findAll();
    }

}
