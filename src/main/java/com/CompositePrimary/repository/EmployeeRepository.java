package com.CompositePrimary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CompositePrimary.Model.Employee;
import com.CompositePrimary.Model.EmployeePKTd;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKTd> {

}
