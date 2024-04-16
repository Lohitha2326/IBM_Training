package com.student.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="course")
public class CourseModel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	private String title;
	private String courseDesc;
	
	@OneToOne
	@JoinColumn(name="courseId",nullable=false)
	private CourseMaterialModel course_material;
	 
//	@ManyToMany
//	@JoinTable(name="StudentModel",joinColumns=@JoinColumn(name="courseId"),inverseJoinColumns=@JoinColumn(name="studentId"))
//	private List<StudentModel> student;
	
    @ManyToOne
	@JoinColumn(name="teacherId")
	private TeacherModel teacher;
	
	@ManyToMany(mappedBy = "course", fetch = FetchType.LAZY) 
     private List<StudentModel> student; 


//	@OneToOne 
//	private CourseMaterialModel cm; 

	
	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CourseModel(int courseId, int studentId, String title, String courseDesc) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.courseDesc = courseDesc;
	}
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	
	
	@Override
	public String toString() {
		return "CourseModel [courseId=" + courseId + ", title=" + title + ", courseDesc="
				+ courseDesc + "]";
	}
	
	
	
	
	
	
	
	

}
