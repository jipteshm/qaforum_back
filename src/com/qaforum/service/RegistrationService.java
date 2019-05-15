package com.qaforum.service;

import com.qaforum.daos.RegistrationDAO;
import com.qaforum.models.User;

public class RegistrationService {
	
	RegistrationDAO registrationDAO;
	
	public boolean registerUser(User user) {
		int count = getRegisterDAO().createUser(user);
		if(count > 0)
			return true;
		else 
			return false;
	}
	
	public RegistrationDAO getRegisterDAO() {
		if(registrationDAO == null)
			return new RegistrationDAO();
		else 
			return registrationDAO;
	}
	
	
	
	

}
