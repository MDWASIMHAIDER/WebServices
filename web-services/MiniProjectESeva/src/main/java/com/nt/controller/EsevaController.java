package com.nt.controller;

import java.util.Map;

import javax.ws.rs.Path;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.command.EsevaCommand;
import com.nt.dto.EsevaDTO;
import com.nt.service.EsevaService;

@Controller
public class EsevaController {
	@Autowired
	EsevaService service;
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/register.htm")
	public String launchRegister(@ModelAttribute("ecmd")EsevaCommand ecmd) {
		return "register";
	}
	@RequestMapping(value="/register.htm",method=RequestMethod.POST)
	public String showRegister(Map<String ,Object>map,@ModelAttribute("ecmd")EsevaCommand ecmd) {
		EsevaDTO dto=new EsevaDTO();
		//dto.setName(ecmd.getName());
		BeanUtils.copyProperties(ecmd, dto);
		String res=service.saveChild(dto);
		map.put("res", res);
		return "register";
	}
}
