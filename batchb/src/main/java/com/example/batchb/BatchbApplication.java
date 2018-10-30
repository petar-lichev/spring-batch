package com.example.batchb;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BatchbApplication implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("dasdasdasdasdas");
		System.out.println("dasdasdasdasdas");
		System.out.println("dasdasdasdasdas");
		System.out.println("dasdasdasdasdas");

	}

	public static void main(String[] args) {
		SpringApplication.run(BatchbApplication.class, args);
	}

//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//		try {
//			ApplicationContext context = new ClassPathXmlApplicationContext("launch-context.xml");
//			Object lock = new Object();
//			synchronized (lock) {
//				lock.wait();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
