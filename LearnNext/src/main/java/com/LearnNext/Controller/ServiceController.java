package com.LearnNext.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LearnNext.Entity.Comments;
import com.LearnNext.Entity.User;
import com.LearnNext.Service.CommentService;
import com.LearnNext.Service.UserService;

@Controller
public class ServiceController {
	@Autowired
	UserService userService;
	
	@Autowired
	CommentService cService;

	@PostMapping("/addUser")
	public String addUser(@RequestParam ("name")String name,
			              @RequestParam ("email")String email,
			              @RequestParam ("password")String password,
			              @RequestParam ("role")String role,
			              Model model)
	
			              
	
	{
		
	  boolean emailExists = userService.checkEmail(email);
		
		
		if(emailExists==false)
		{
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		
		
	
		userService.addUser(user);
		return "Login-1";
		}
		else
		{
			model.addAttribute("errorMessage", "Email Already Exist");
			return "Register-1";
		}
	}
	
	
	// Old Code
	/*

	@PostMapping("/validate")
	public String validate(
			             @RequestParam ("email")String email,
			             @RequestParam ("password")String password,
			             Model model)
	{
		
		if(userService.checkEmail(email))
		{
		boolean val = userService.validate(email, password);
		// if user is valid
		if(val==true)
		{
			//System.out.println("Login successfull");
			if(userService.getuserRole(email).equals("trainer"))
			{
				return "TrainerHome";
			}
			else
			{
			return "Student";
			}
			
		}
		else {
			
		  model.addAttribute("errorMessage", "Incorrect credentials");
		  System.out.println("errorMessage");
          return "Login-1";  // Return to login page with error message
		}
		}
		else
		{
			 model.addAttribute("errorMessage", "Email does not exist");
		        return "Login-1";  // Return to login page with error message
		}
	}
	
	*/
	
	  @PostMapping("/validate")
	    public String validate(
	            @RequestParam("email") String email,
	            @RequestParam("password") String password,
	            Model model) {

	        if (userService.checkEmail(email)) {
	            boolean isValid = userService.validate(email, password);
	            if (isValid) {
	                String role = userService.getuserRole(email);
	                String uniqueCode = userService.getUniqueCode(email);
	                System.out.println(uniqueCode);

	                model.addAttribute("uniqueCode", uniqueCode); // Highlight: Add uniqueCode to the model

	                if ("trainer".equals(role)) {
	                    return "Trainer";
	                } else {
	                    return "Student";
	                }
	            } else {
	                model.addAttribute("errorMessage", "Incorrect credentials");
	                return "Login-1";  // Return to login page with error message
	            }
	        } else {
	            model.addAttribute("errorMessage", "Email does not exist");
	            return "Login-1";  // Return to login page with error message
	        }
	    }
	
	
	@PostMapping("/addComment")
	public String addComment(@RequestParam("comment") String comment,Model model)
	{
		
		Comments c= new Comments();
		c.setComment(comment);
		cService.addComment(c);
		
		List<Comments> comment1 = cService.commentList();
		model.addAttribute("comment",comment1);
		//System.out.println(comment1);
	
		return "MyLesson";
		
		
	}
	
}
