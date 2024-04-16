package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.model.TeacherModel;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherModel,Integer>{

}
