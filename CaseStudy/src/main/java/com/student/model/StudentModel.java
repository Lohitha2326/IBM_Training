package com.student.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="student")
public class StudentModel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentEmail;
	private int phoneNo;
	private String studentAddress;
	 

	@JoinColumn(name="course_id") 
	private int courseId; 

	 

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL) 

	    @JoinTable(name = "STUDENT_COURSE_TABLE", 

	            joinColumns = { 

	                    @JoinColumn(name = "student_id", referencedColumnName = "studentId") 

	            }, 

	            inverseJoinColumns = { 

	                    @JoinColumn(name = "course_id", referencedColumnName = "courseId") 

	            } 

	    ) 

	private List<CourseModel> course; 

	
	public int getStudentId() {
		return studentId;
	}
	
	
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentModel(int studentId, String studentName, String studentEmail, int phoneNo, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.phoneNo = phoneNo;
		this.studentAddress = studentAddress;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", phoneNo=" + phoneNo + ", studentAddress=" + studentAddress + "]";
	}
	
	
	

}
