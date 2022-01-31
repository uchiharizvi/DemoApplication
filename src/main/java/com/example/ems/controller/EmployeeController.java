package com.example.ems.controller;

import com.example.ems.dao.entity.Employee;
import com.example.ems.model.response.Users;
import com.example.ems.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private RegisterService registerService;

    @GetMapping("/employee/details")
    public Users getEmployeeDetails() {
        return new Users();
    }

    @PostMapping("/employee/register")
    public String registerEmployee(@RequestBody Employee employee) throws Exception {
        return registerService.registerEmployee(employee);
    }
}
