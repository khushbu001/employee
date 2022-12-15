package com.employee.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagement.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

}
