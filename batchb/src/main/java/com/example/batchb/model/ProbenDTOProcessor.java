package com.example.batchb.model;

import org.springframework.batch.item.validator.ValidatingItemProcessor;

public class ProbenDTOProcessor extends ValidatingItemProcessor<ProbnoDTO> {
	private int recordCount = 0;

	@Override
	public ProbnoDTO process(ProbnoDTO probno) {
		recordCount++;
		System.out.println(probno.getLawyer_name() + " " + probno.getEmail() + " was record number " + recordCount
				+ " in your file.");
		return probno;
	}
}