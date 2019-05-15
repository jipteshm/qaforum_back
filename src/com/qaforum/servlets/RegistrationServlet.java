package com.qaforum.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qaforum.models.User;
import com.qaforum.service.RegistrationService;
import com.qaforum.utils.MD5Util;

public class RegistrationServlet extends HttpServlet{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

		
		String firstName=request.getParameter("firstname");  
		String lastName=request.getParameter("lastname");  
		String email=request.getParameter("email");  
		String mobile=request.getParameter("mobile");  
		String password=request.getParameter("password");  
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPasswordHash(MD5Util.getMD5Signature(password));
		
		
		RegistrationService registerService =  new RegistrationService();
		
		boolean registerStatus = registerService.registerUser(user);
		
		if(registerStatus)
			response.sendRedirect("login?registerStatus=success&firstName="+firstName);
		else
			response.sendRedirect("register?registerStatus=error");
        
   }

}
