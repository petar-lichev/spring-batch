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


	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		System.out.println("Hello, ");
		System.out.println("Hello, ");
		System.out.println("Hello, ");
		System.out.println("Hello, ");
		System.out.println("Hello, ");
		System.out.println("Hello, ");
		
		return RepeatStatus.FINISHED;
	}

}
