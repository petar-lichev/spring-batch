package com.example.batchb.model;

public class ProbnoDTO {

	private Long lawsuite_id;
	private String lawyer_name;
	private String email;

	public Long getLawsuite_id() {
		return lawsuite_id;
	}

	public void setLawsuite_id(Long lawsuite_id) {
		this.lawsuite_id = lawsuite_id;
	}

	public String getLawyer_name() {
		return lawyer_name;
	}

	public void setLawyer_name(String lawyer_name) {
		this.lawyer_name = lawyer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() { 
	    return "Name: '" + this.lawyer_name + "', Lawsuite ID: '" + this.lawsuite_id + "', Email: '" + this.email + "'";
	} 

}
