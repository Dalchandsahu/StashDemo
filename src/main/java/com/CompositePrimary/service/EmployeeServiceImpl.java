package com.CompositePrimary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CompositePrimary.Model.Employee;
import com.CompositePrimary.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmp(Employee emp) {
		Employee save = employeeRepository.save(emp);
	}
}
