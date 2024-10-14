package com.LearnNext.Service;

import com.LearnNext.Entity.User;

public interface UserService {

	
	//add new user to data base
	String addUser(User user);
	//check email is already exists or not in databse
	boolean checkEmail(String email);
	// Validate users credentials
	boolean validate(String email,String password);
	
	// get user role
	String getuserRole(String email);
	
	   // Add method to fetch uniqueCode
    String getUniqueCode(String email); // Highlight: New method added

}
