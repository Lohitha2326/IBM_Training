package com.ibm;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ibm.model.Employee;
import com.ibm.service.EmpService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
		
		Employee emp=context.getBean(Employee.class);
		
		emp.setEmpno(102);
		emp.setEname("bcd");
		emp.setSal(16000);
	    emp.setDeptno(20);
		
		EmpService service=context.getBean(EmpService.class);
		service.addEmployee(emp);//to insert the data
		
		//service.updateEmployee(emp);
		//to print the data in console
		List<Employee> all=service.getEmployees();
		System.out.println(all);
	}
}
