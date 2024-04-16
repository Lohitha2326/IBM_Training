package com.job.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.JobModel;
import com.job.service.JobService;

@RestController
public class JobRestController {
	
	@Autowired
	JobService service;
	
	@GetMapping("/jobPosts")
	public List<JobModel> viewJobs()
	{
		return service.getJobs();
	}
	
	//Post man 
	//to get the single value details
	@GetMapping("/jobPost/{postId}")
	public Optional<JobModel> viewJob(@PathVariable int postId)
	{
		return service.getJob(postId);
	}
	
	@GetMapping("/jobPosts/{postExp}")
	public List<JobModel> findByPostExp(@PathVariable int postExp)
	{
		return service.getJob1(postExp);
	}
	
	@GetMapping("/jobPost1/{postDesc}")
	public List<JobModel> findByPostDesc(@PathVariable String postDesc)
	{
		return service.getJob2(postDesc);
	}
	
	
	@GetMapping("/jobPost1/desc1/{postDesc1}")
	public List<JobModel> findByPostDesc1(@PathVariable String postDesc1)
	{
		return service.postDesc1(postDesc1);
	}
	
	
	
	
	
	//The UI part will not be accessible for entering details everytime.so to add values we use post mapping
	@PostMapping("/jobPosts")
	public String putJob(@RequestBody JobModel job)
	{
		service.addJob(job);
		return "success";
	}
	
	//To update the values
	@PutMapping("/jobPosts")
	public String updateJob(@RequestBody JobModel job)
	{
		service.updateJob(job);
		return "updated";
	}
	
	//to delete
	@DeleteMapping("/jobPosts/{postId}")
	public String deleteJob(@PathVariable int postId)
	{
		service.deleteJob(postId);
		return "deleted";
	}
	

}
