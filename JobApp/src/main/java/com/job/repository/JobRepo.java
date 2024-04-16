package com.job.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.job.model.JobModel;

@Repository
public class JobRepo {
	
	List<JobModel> jobs=new ArrayList<JobModel>(Arrays.asList());
	
	public void addJob(JobModel job) {
		jobs.add(job);
	}

	public List<JobModel> getJobs() {
		
		return jobs;
		
	}

	public JobModel getJob(int postId) {
		for(JobModel job:jobs)
		{
			if(job.getPostId()==postId)
			{
				return job;
			}
		}
		return null;
	}
	
	
	
	public void updateJob(JobModel job)
	{
		for(JobModel jp:jobs)
		{
			if(jp.getPostId()==job.getPostId()) {
				jp.setPostDesc(job.getPostDesc());
				jp.setPostExp(job.getPostExp());
				jp.setPostTechStack(job.getPostTechStack());
				
				
			}
		}
	}

	public void deleteJob(int postId) {
		for(JobModel jp1:jobs)
		{
			if(jp1.getPostId()==postId) {
				jobs.remove(jp1);
			}
		}
	
	}

}
