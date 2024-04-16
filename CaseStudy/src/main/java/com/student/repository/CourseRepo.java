package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.CourseModel;

public interface CourseRepo extends JpaRepository<CourseModel,Integer>{

}
