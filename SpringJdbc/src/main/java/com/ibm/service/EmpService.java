package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Employee;
import com.ibm.repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo repo;
	
	public void addEmployee(Employee emp)
	{
		repo.save(emp);
	}

	public void updateEmployee(Employee emp) {
		
		repo.saveUpdate(emp);
		
	}

	public List<Employee> getEmployees() {
		return repo.getAll();
		
	}

}
