package com.example.demo.service;

import com.example.demo.dao.entity.RegisterEmployee;
import com.example.demo.dao.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterEmployeeImpl implements RegisterService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String registerEmployee(RegisterEmployee registerEmployee) throws Exception {
        try {
            employeeRepository.save(registerEmployee);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        return "201 Created";
    }
}
