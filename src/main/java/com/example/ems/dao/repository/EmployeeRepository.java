package com.example.ems.dao.repository;

import com.example.ems.dao.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
    List<Employee> findByLastName(String lastName);

    List<Employee> findByDeptName(String deptName);

    Employee findById(long id);

}
