package com.example.batchb.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProbenRowMapper implements RowMapper<ProbnoDTO> {

	public static final String LAWSUITE_ID_COLUMN = "lawsuite_id";
	public static final String NAME_COLUMN = "name";
	public static final String EMAIL_COLUMN = "email";

	@Override
	public ProbnoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		ProbnoDTO probno = new ProbnoDTO();

//		System.out.println(rs.getLong(LAWSUITE_ID_COLUMN) + "-----" + rs.getString(NAME_COLUMN) + "-----"
//				+ rs.getString(EMAIL_COLUMN));
		probno.setLawsuite_id(rs.getLong(LAWSUITE_ID_COLUMN));
		probno.setLawyer_name(rs.getString(NAME_COLUMN));
		probno.setEmail(rs.getString(EMAIL_COLUMN));
		return probno;
	}

}
