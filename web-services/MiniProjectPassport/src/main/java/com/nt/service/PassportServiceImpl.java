package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassportBO;
import com.nt.dao.PassportDAO;
import com.nt.dto.PassportDTO;

@Service
public class PassportServiceImpl implements PassportService {
	
	@Autowired
	PassportDAO dao;
	
	@Override
	public String addCustomer(PassportDTO dto) {
		PassportBO  bo=new PassportBO();
		BeanUtils.copyProperties(dto, bo);
		int res=dao.registerCustomer(bo);
		if(res!=0)
		return "Customer Registrered Successfully";
		else
			return "Registration Failed";
	}

}
