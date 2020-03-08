package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.PassportCommand;
import com.nt.dto.PassportDTO;
import com.nt.service.PassportService;

@Controller
public class PassportController {
	
	@Autowired
	PassportService service;
	
	public PassportController() {
		System.out.println("controller");
	}
	@RequestMapping("/home.htm")
	public String showHome() {
		return "home";
	}
	@GetMapping("/register.htm")
	public String registerCust(@ModelAttribute("pcmd")PassportCommand cmd) {
		return "register";
	}
	@PostMapping("/pregister.htm")
	public String registerCustomer(Map<String,Object>map,@ModelAttribute("pcmd")PassportCommand cmd) {
		PassportDTO dto=new PassportDTO();
		BeanUtils.copyProperties(cmd, dto);
		String res=service.addCustomer(dto);
		map.put("res", res);
		return "register";
	}
}
