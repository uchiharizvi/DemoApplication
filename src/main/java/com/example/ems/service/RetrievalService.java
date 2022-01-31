package com.example.ems.service;

import com.example.ems.dao.entity.Employee;

public interface RetrievalService {
    Employee getEmployeeDetail(Long id) throws Exception;
    Iterable<Employee> getAllEmployees() throws Exception;
}
