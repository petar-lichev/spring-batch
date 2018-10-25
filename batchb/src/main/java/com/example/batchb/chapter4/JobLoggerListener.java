package com.example.batchb.chapter4;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class JobLoggerListener {
	@BeforeJob
	public void beforeJob(JobExecution jobExecution) {
		System.out.println(" is beginning execution");
		System.out.println(" is beginning execution");
		System.out.println(" is beginning execution");
		System.out.println(" is beginning execution");
	}

	@AfterJob
	public void afterJob(JobExecution jobExecution) {
		System.out.println(jobExecution.getJobInstance().getJobName() + " has completed with the status "
				+ jobExecution.getStatus());
		System.out.println(" has completed with the status ");
		System.out.println(" has completed with the status ");
		System.out.println(" has completed with the status ");
		System.out.println(" has completed with the status ");
		System.out.println(" has completed with the status ");
	}
	

}
