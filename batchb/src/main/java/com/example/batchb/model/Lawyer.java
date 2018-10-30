package com.example.batchb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lawyer {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lawyer_id;
	
	private String name;
	
	private String email;

	public Long getLawyer_id() {
		return lawyer_id;
	}

	public void setLawyer_id(Long lawyer_id) {
		this.lawyer_id = lawyer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
