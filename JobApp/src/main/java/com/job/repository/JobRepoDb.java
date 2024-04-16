package com.job.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.job.model.JobModel;

@Repository
public interface JobRepoDb extends JpaRepository<JobModel, Integer>{
	
	List<JobModel> findByPostExp(int postExp);
	List<JobModel> findByPostDesc(String postDesc);
	List<JobModel> findByPostDescContains(String postDesc);
	
	
	@Query("select j from JobModel j where j.postDesc LIKE %?1%")
	List<JobModel> findByPostDescTest(String postDesc);

}
