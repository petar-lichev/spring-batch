package com.example.batchb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchbApplication implements ApplicationRunner{

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
}
