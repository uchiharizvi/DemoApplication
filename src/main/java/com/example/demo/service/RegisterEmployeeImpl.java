package com.example.demo.service;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterEmployeeImpl implements RegisterService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String registerEmployee(Employee employee) throws Exception {
        try {
            employeeRepository.save(employee);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        return "201 Created";
    }
}
