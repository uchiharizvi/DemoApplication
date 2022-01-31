package com.example.demo.dao.repository;

import com.example.demo.dao.entity.RegisterEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<RegisterEmployee, String> {
}
