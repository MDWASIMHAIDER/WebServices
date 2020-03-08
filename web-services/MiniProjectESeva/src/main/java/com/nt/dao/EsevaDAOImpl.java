package com.nt.dao;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EsevaBO;

@Repository
public class EsevaDAOImpl implements EsevaDAO {
	
	@Autowired
	private JdbcTemplate jt;
	
	private static final String REGISTER_CHILD_QUERY="INSERT INTO ESEVA VALUES(?,?,?,?,?,?,?,?,?)";
	
	@Override
	public int registerChild(EsevaBO bo) {
		int bid=0;
		Random rad=new Random();
		bid=rad.nextInt(10000);
		int res=jt.update(REGISTER_CHILD_QUERY, bo.getName(),
																										  bo.getPhone(),
																										  bo.getFatherName(),
																										  bo.getMotherName(),
																										  bo.getGender(),
																										  bo.getReligion(),
																										  bo.getAddress(),
																										  bo.getDob(),
																										  bid);
		
		return res;
	}

}
