package com.example.ems.service;

import com.example.ems.dao.entity.Employee;

public interface RegisterService {
    String registerEmployee(Employee employee) throws Exception;
}
