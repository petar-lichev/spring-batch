package com.example.batchb.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Configuration;

/**
 * @author Petar Lichev
 *
 */
@Configuration
@EnableBatchProcessing
public class HelloWorld implements Tasklet {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		String name = (String) chunkContext.getStepContext().getJobParameters().get("name");
		Long id = (Long) chunkContext.getStepContext().getJobParameters().get("run.id");
		ExecutionContext job_context = chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
		ExecutionContext execution_context = chunkContext.getStepContext().getStepExecution().getExecutionContext();
		
		job_context.put("imeto", name);
		execution_context.put("user.name", name);
		// String name = "test";
		System.out.println("Hello, " + name + " ------------------> " + id);
		System.out.println("Hello, " + name + " ------------------> " + id);
		System.out.println("Hello, " + name + " ------------------> " + id);
		System.out.println("Hello, " + name + " ------------------> " + id);
		System.out.println("Hello, " + name + " ------------------> " + id);
		System.out.println("Hello, " + name + " ------------------> " + id);
		
		return RepeatStatus.FINISHED;
	}

}
