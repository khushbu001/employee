package com.employee.employeemanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.service.EmployeeService;

//@EnableSwagger2
@RestController
@ControllerAdvice
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired(required = true)
	private EmployeeService employeeService;

	// @ApiOperation("This api will use to create the employee emtity")
	@PostMapping(value = "/employees")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {

		logger.info("EmployeeController::createEmployee::Start");

		Employee emp = employeeService.createEmployee(employee);
		logger.info("EmployeeController::createEmployee::End");

		return ResponseEntity.status(HttpStatus.CREATED).body(emp);
	}

	// @ApiOperation("This api will use to update the employee.")
	@PutMapping(value = "/employees/{empId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long empId, @RequestBody Employee employee) {

		logger.info("EmployeeController::updateEmployee::Start");
		logger.debug("empId: {}, employee: {}", empId, employee);

		Employee updateEmployee = employeeService.updateEmployee(empId, employee);

		logger.debug(" updateEmployee: {}", updateEmployee);
		logger.info("EmployeeController::updateEmployee::End");

		return ResponseEntity.status(HttpStatus.OK).body(updateEmployee);
	}

	// @ApiOperation("This api will use to delete a employee data ")
	@DeleteMapping(value = "/employees/{empId}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable Long empId) {

		logger.info("EmployeeController::deleteEmployee::Start");
		employeeService.deleteEmpById(empId);

		logger.debug("empId:{} ", empId);
		logger.info("EmployeeController::deleteEmployee::End");

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	// @ApiOperation("This api will use to get one employee.")
	@GetMapping(value = "/employees/{empId}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Long empId) {

		logger.info("EmployeeController::getOneEmployee::Start");

		Employee emp = employeeService.getOneEmployee(empId);

		logger.debug("empId:{} , emp:{} ", empId, emp);
		logger.info("EmployeeController::getOneEmployee::End");

		return ResponseEntity.status(HttpStatus.OK).body(emp);

	}

	// @ApiOperation("This api will use to get all the employee.")
	@GetMapping(value = "/employees")
	public ResponseEntity<List<Employee>> getAllEmployee() {

		logger.debug("EmployeeController::getAllEmployee::Start");
		List<Employee> allEmployee = employeeService.getAllEmployee();
		logger.debug("EmployeeController::getAllEmployee::End");

		return ResponseEntity.status(HttpStatus.OK).body(allEmployee);

	}

}
