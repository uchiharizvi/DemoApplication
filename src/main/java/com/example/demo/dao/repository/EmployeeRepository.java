package com.example.demo.dao.repository;

import com.example.demo.dao.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByLastName(@Param("name") String name);
}
