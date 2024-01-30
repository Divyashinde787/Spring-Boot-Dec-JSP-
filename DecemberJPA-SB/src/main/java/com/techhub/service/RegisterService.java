package com.techhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techhub.entity.Register;
import com.techhub.repository.RegisterRepo;

@Service("RegService")
public class RegisterService {
	@Autowired
	RegisterRepo registerRepo;
	
	public boolean isRegister(Register register) {
		Register r=registerRepo.save(register);
		if(r!=null) {
		return true;
		}else {
			return false;
		}
	}
}
