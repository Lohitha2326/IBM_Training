package com.student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.CourseModel;
import com.student.model.StudentModel;
import com.student.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/students")
	public String putJob(@RequestBody StudentModel s)
	{
		service.addJob(s);
		return "success";
	}
	
	@GetMapping("/student")
	public List<StudentModel> getJob()
	{
		return service.view();
	}
	
	@GetMapping("/student/{studentId}")
	public Optional<StudentModel> viewJob(@PathVariable int studentId)
	{
		return service.getJob(studentId);
	}
	
	
	@PutMapping("/student")
	public String updateJob(@RequestBody StudentModel student)
	{
		service.updateJob(student);
		return "updated";
	}
	
	//to delete
	@DeleteMapping("/student/{studentId}")
	public String deleteJob(@PathVariable int studentId)
	{
		service.deleteJob(studentId);
		return "deleted";
	}


}
