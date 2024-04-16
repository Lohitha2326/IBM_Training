package com.student.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="teacher")
public class TeacherModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	
	@OneToMany(mappedBy="teacher")
	private List<CourseModel> course;
	
	public TeacherModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TeacherModel(int teacherId, int courseId, String teacherName, String teacherEmail) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
	}
	
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	@Override
	public String toString() {
		return "TeacherModel [teacherId=" + teacherId + ",teacherName=" + teacherName
				+ ", teacherEmail=" + teacherEmail + "]";
	}
	
	
	
	
	
	
	
	

}
