package com.CompositePrimary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.CompositePrimary.Model.Employee;
import com.CompositePrimary.service.EmployeeServiceI;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	public void saveEmp(Employee emp) {
		employeeServiceI.saveEmp(emp);
	}
}

