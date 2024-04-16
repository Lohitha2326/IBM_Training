package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.StudentModel;
import com.student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;

	public void addJob(StudentModel s) {
		repo.save(s);
	}



	public List<StudentModel> view() {
		return repo.findAll();
		
	}



	public Optional<StudentModel> getJob(int studentId) {
		return repo.findById(studentId);
	}



	public void updateJob(StudentModel student) {
		repo.save(student);
	}



	public void deleteJob(int studentId) {
		// TODO Auto-generated method stub
		repo.deleteById(studentId);
	}

}
