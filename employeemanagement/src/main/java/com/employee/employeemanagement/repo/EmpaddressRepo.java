package com.employee.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagement.entity.EmpAddress;
@Repository
public interface EmpaddressRepo extends JpaRepository<EmpAddress, Long> {

}
