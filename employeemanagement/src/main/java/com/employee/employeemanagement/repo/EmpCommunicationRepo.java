package com.employee.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagement.entity.EmpCommunicationMedia;

@Repository
public interface EmpCommunicationRepo extends JpaRepository<EmpCommunicationMedia, Long> {

}
