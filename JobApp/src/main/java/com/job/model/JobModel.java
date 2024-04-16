package com.job.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity //to create table
@Table(name="jobpost")//to create your own table name

public class JobModel {
	
	@Id //primary key column
	private int postId;
	private String postProfile;
	private String postDesc;
	private int postExp;
	private String prevComp;
	private List<String>postTechStack;
	
	
	public JobModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public JobModel(int postId, String postProfile, String postDesc, int postExp, String prevComp,
			List<String> postTechStack) {
		super();
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.postExp = postExp;
		this.prevComp = prevComp;
		this.postTechStack = postTechStack;
	}


	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostProfile() {
		return postProfile;
	}
	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}
	public String getPostDesc() {
		return postDesc;
	}
	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}
	public int getPostExp() {
		return postExp;
	}
	public void setPostExp(int postExp) {
		this.postExp = postExp;
	}
	public String getPrevComp() {
		return prevComp;
	}
	public void setPrevComp(String prevComp) {
		this.prevComp = prevComp;
	}
	public List<String> getPostTechStack() {
		return postTechStack;
	}
	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}
	@Override
	public String toString() {
		return "JobModel [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc + ", postExp="
				+ postExp + ", prevComp=" + prevComp + ", postTechStack=" + postTechStack + "]";
	}
	
	
	
	
	
	

}
