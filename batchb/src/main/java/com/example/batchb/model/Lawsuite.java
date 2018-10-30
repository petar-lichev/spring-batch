package com.example.batchb.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Lawsuite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lawsuite_id;

	private LocalDate nasrocheno;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@NotNull
	private Lawyer lawyer;

	public Long getLawsuite_id() {
		return lawsuite_id;
	}

	public void setLawsuite_id(Long lawsuite_id) {
		this.lawsuite_id = lawsuite_id;
	}

	public LocalDate getNasrocheno() {
		return nasrocheno;
	}

	public void setNasrocheno(LocalDate nasrocheno) {
		this.nasrocheno = nasrocheno;
	}

}
