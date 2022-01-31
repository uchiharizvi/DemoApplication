package com.example.demo.service;

import com.example.demo.dao.entity.Employee;

public interface RetrievalService {
    Employee getEmployeeDetail(Long id) throws Exception;
    Iterable<Employee> getAllEmployees() throws Exception;
}
