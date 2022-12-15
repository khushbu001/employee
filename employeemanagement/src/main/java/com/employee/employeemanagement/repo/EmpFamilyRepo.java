package com.employee.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagement.entity.EmpFamily;

@Repository
public interface EmpFamilyRepo extends JpaRepository<EmpFamily, Long>{

}
