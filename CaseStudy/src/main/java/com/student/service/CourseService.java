package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.CourseModel;
import com.student.repository.CourseRepo;

@Service
public class CourseService {
@Autowired
CourseRepo repo;
	public void add(CourseModel course) {
		repo.save(course);
		
	}
	
	public List<CourseModel> view()
	{
		return repo.findAll();
	}

	public Optional<CourseModel> getJob(int courseId) {
		return repo.findById(courseId);
	}

	public void updateJob(CourseModel course) {
		repo.save(course);
		
	}

	public void deleteJob(int courseId) {
		repo.deleteById(courseId);
		
	}

}
