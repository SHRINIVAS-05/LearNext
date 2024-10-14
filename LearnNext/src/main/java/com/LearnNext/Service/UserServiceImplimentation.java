package com.LearnNext.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Entity.User;
import com.LearnNext.UserRepository.UserRepository;

@Service
public class UserServiceImplimentation implements UserService
{

	@Autowired
	UserRepository userrepo;

	@Override
	public String addUser(User user) {
		userrepo.save(user);
		return "User details added successfully !";
	}

	@Override
	public boolean checkEmail(String email) {
		
		boolean YesNo =  userrepo.existsByEmail(email);
		return YesNo;
		//return userrepo.existsByEmail(email);
	
	}
	

	@Override
	public boolean validate(String email, String password) {
		
		if(userrepo.existsByEmail(email))
		{
			User u= userrepo.getByEmail(email);
			String dbPassword = u.getPassword();
			if(password.equals(dbPassword))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	@Override
	public String getuserRole(String email) {
		
		User u = userrepo.getByEmail(email);
		return u.getRole();
		
	}
	  @Override
	    public String getUniqueCode(String email) { // Highlight: New method added
	        User u = userrepo.getByEmail(email);
	        return u != null ? u.getUniqueCode() : null;
	    }

	

}
