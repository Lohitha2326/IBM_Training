package com.job.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Referencing multiple tables

@Entity
@Table(name="emp1")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int empno;
	private String ename;
	private int sal;
	
	//for setting the column name
	@Column(name="dept_no")
	private int deptno;
	
	
	@ManyToOne
	@JoinColumn(name="deptno",nullable=false)
	private Dept dept;
	

}
