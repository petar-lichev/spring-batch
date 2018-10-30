package com.example.batchb.job;

import java.util.List;

import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.batchb.model.ProbnoDTO;

/**
 * @author Petar Lichev
 *
 */
@Configuration
@EnableBatchProcessing
public class HelloWorld implements Tasklet {

	private static final String HELLO = "Hello, %s!";
	private static final String WELCOME = "And then we have %s!";
	private static final String JOB_NAME = "helloWorldJob";

	@Autowired
	private JobExplorer explorer;

	public JobExplorer getExplorer() {
		return explorer;
	}

	public void setExplorer(JobExplorer explorer) {
		this.explorer = explorer;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		System.out.println(explorer != null);
		List<JobInstance> instances = explorer.getJobInstances(JOB_NAME, 0, Integer.MAX_VALUE);
		String name = (String) chunkContext.getStepContext().getJobParameters().get("name");
		if (instances != null && instances.size() > 1) {
			System.out.println(String.format(WELCOME, name));
		} else {
			System.out.println(String.format(HELLO, name));
		}

		ApplicationContext context = new ClassPathXmlApplicationContext("jobs/helloWorld.xml");
		JdbcCursorItemReader<ProbnoDTO> itemReader = context.getBean("itemReader", JdbcCursorItemReader.class);

		int counter = 0;
		ExecutionContext executionContext = new ExecutionContext();

		itemReader.open(executionContext);

		ProbnoDTO proben = new ProbnoDTO();
		while (proben != null) {
			System.out.println("Iteration number: " + counter);
			proben = itemReader.read();
			
			System.out.println(proben);
			counter++;
		}
		itemReader.close();

		return RepeatStatus.FINISHED;
	}

}
