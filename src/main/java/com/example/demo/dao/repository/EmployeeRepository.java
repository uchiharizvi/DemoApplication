package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
    List<Employee> findByLastName(String lastName);

    List<Employee> findByFisrtName(String firstName);

    List<Employee> findByDeptName(String deptName);

    Employee findById(long id);

}
