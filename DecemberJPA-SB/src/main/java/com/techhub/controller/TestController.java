package com.techhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techhub.service.RegisterService;
import com.techhub.entity.Register;
@RestController
public class TestController {
	
	@Autowired
	RegisterService regService;
	
	@PostMapping(value="/save")
	
	public String register(@RequestBody Register reg) {
		boolean b=regService.isRegister(reg);
		if(b) {
			return "Record save in database";
		}
		else {
			return "Some problem is there......";
		}
	}
}

