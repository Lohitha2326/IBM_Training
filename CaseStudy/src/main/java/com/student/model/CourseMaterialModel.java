package com.student.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="course_material")
public class CourseMaterialModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int materialId;
	private String courseContent;
	

//	@OneToOne(mappedBy="course_material")
//	private CourseModel course;
	
	
	

	@OneToOne() 
	@JoinColumn(name="course_id") 
    private CourseModel course; 	
	
	
	public CourseMaterialModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CourseMaterialModel(int materialId,String courseContent) {
		super();
		this.materialId = materialId;
		this.courseContent = courseContent;
	}
	
	
	
	
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	
	
	@Override
	public String toString() {
		return "CourseMaterialModel [materialId=" + materialId + ", courseContent="
				+ courseContent + "]";
	}
	
	
	

}
