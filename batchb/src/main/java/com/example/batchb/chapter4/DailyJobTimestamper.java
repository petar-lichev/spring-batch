package com.example.batchb.chapter4;

import java.util.Date;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

public class DailyJobTimestamper implements JobParametersIncrementer {

	@Override
	public JobParameters getNext(JobParameters parameters) {

		Date today = new Date();

		if (parameters != null && !parameters.isEmpty()) {
			Date oldDate = parameters.getDate("current.date", new Date());
			//today = DateUtils.addDays(oldDate, 1);
		}
		return new JobParametersBuilder().addDate("current.date", today).toJobParameters();
	}

}
