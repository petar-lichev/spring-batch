package com.example.batchb;

import javax.transaction.Transactional;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.batchb.model.ProbenRowMapper;
import com.example.batchb.model.ProbnoDTO;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "classpath*:launch-context.xml"})
public class BatchTest {
	@Autowired
	private JobLauncher launcher;

	@Autowired 
	private BasicDataSource dataSource; 

	@Test
	public void batchTest() throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		ApplicationContext context = new ClassPathXmlApplicationContext("jobs/helloWorld.xml");
		JobLauncher jobLauncher = context.getBean(JobLauncher.class);
		Job helloWorldJob = context.getBean(Job.class);

		jobLauncher.run(helloWorldJob,
				new JobParametersBuilder().addString("name", "ebog", true).toJobParameters());

	}


}
