package com.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.model.JobModel;
import com.job.repository.JobRepo;
import com.job.repository.JobRepoDb;

@Service
public class JobService {

	@Autowired
	//JobRepo repo;
	JobRepoDb repo;

	public void addJob(JobModel job) {
		
		repo.save(job);
	}


	public List<JobModel> getJobs() {
		return repo.findAll();
	}


	public Optional<JobModel> getJob(int postId) {
		return repo.findById(postId);
	}


	public void updateJob(JobModel job) {
		repo.save(job);
	}


	public void deleteJob(int postId) {
		 repo.deleteById(postId);
	}


	public List<JobModel> getJob1(int postExp) {
		return repo.findByPostExp(postExp);
	}
	
	public List<JobModel> getJob2(String postDesc) {
		return repo.findByPostDesc(postDesc);
	}


	public List<JobModel> postDesc1(String postDesc1) {
		return repo.findByPostDescTest(postDesc1);
	}
	
	


}
