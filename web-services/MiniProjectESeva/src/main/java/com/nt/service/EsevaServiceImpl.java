package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EsevaBO;
import com.nt.dao.EsevaDAO;
import com.nt.dto.EsevaDTO;

@Service
public class EsevaServiceImpl implements EsevaService {
	@Autowired
	private EsevaDAO dao;
	@Override
	public String saveChild(EsevaDTO dto) {
		EsevaBO bo=new EsevaBO();
		BeanUtils.copyProperties(dto, bo);
		int res=dao.registerChild(bo);
		if(res!=0) {
			return "Child registered Successsfully";
		}
		else {
			return "Child not registered";
		}
	}

}
