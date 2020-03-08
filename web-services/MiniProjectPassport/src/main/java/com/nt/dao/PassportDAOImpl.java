package com.nt.dao;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.PassportBO;

@Repository
public class PassportDAOImpl implements PassportDAO {
	@Autowired
	private JdbcTemplate jt;
	
	private static final String INSERT_PASSPORTHOLDER_QUERY="INSERT INTO PASSPORT VALUES(?,?,?,?,?,?,?,?)";
	@Override
	public int registerCustomer(PassportBO bo) {
		int res=0;
		Random rd=new Random();
		String bid="BID"+rd.nextInt(bo.getBirthId());
		res=jt.update(INSERT_PASSPORTHOLDER_QUERY, bid,
																							   bo.getPholderName(),
																							   bo.getFatherName(),
																							   bo.getProfession(),
																							   bo.getMaritialStatus(),
																							   bo.getCriminalRecord(),
																							   bo.getPholderAddress(),
																							   bo.getPhone());
		return res;
	}

}
