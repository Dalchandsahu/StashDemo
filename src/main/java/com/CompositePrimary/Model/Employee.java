package com.CompositePrimary.Model;

import jakarta.persistence.*;

@Entity
@IdClass(EmployeePKTd.class)
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String empName;
	
	private String empAddr;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empRating;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public int getEmpRating() {
		return empRating;
	}
	public void setEmpRating(int empRating) {
		this.empRating = empRating;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", empRating=" + empRating
				+ "]";
	}
}
