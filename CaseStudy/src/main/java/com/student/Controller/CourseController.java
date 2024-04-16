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
import org.springframework.web.bind.annotation.RestController;

import com.student.model.CourseModel;
import com.student.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@PostMapping("/addCourse")
	public String save(@RequestBody CourseModel course)
	{
		service.add(course);
		return "inserted";
	}
	
	@GetMapping("/viewCourse")
	public List<CourseModel> get()
	{
		return service.view();
	}
	
	@GetMapping("/viewCourse/{courseId}")
	public Optional<CourseModel> viewJob(@PathVariable int courseId)
	{
		return service.getJob(courseId);
	}
	
	
	@PutMapping("/viewCourse")
	public String updateJob(@RequestBody CourseModel course)
	{
		service.updateJob(course);
		return "updated";
	}
	
	//to delete
	@DeleteMapping("/viewCourse/{courseId}")
	public String deleteJob(@PathVariable int courseId)
	{
		service.deleteJob(courseId);
		return "deleted";
	}

}
