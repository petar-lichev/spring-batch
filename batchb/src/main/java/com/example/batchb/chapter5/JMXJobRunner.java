package com.example.batchb.chapter5;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.NoSuchJobException;

public interface JMXJobRunner {

	public void runJob(String jobName) throws NoSuchJobException,
	JobInstanceAlreadyExistsException, JobParametersInvalidException;
}