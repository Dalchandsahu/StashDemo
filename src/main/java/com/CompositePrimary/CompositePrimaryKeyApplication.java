package com.CompositePrimary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.CompositePrimary.Controller.EmployeeController;
import com.CompositePrimary.Model.Employee;

@SpringBootApplication
public class CompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CompositePrimaryKeyApplication.class, args);
		
		EmployeeController controller = run.getBean(EmployeeController.class);
	
		Employee emp = new Employee();
	    emp.setEmpId(1);
	    emp.setEmpName("Dalchand");
	    emp.setEmpAddr("Raipur");
	    emp.setEmpRating(2);
	    
	    controller.saveEmp(emp);
	}

}
