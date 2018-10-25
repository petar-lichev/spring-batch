package com.example.batchb.job;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class HelloWorld implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Hello, WORLD");
		System.out.println("Hello, WORLD");
		System.out.println("Hello, WORLD");
		System.out.println("Hello, WORLD");
		
		System.out.println("Hello, WORLD");
		System.out.println("Hello, WORLD");
		System.out.println("Hello, WORLD");
		return RepeatStatus.FINISHED;
	}

}
