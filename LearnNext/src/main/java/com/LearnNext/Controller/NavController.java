package com.LearnNext.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	
	@GetMapping("/home")
	public String index()
	{
		return "index";
		
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
		
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
		
	}
	@GetMapping("/summary")
	public String home()
	{
		return "home";
		
	}
	
	@GetMapping("/createcourse")
	public String createCourse()
	{
		return "createCourse";
		
	}
	
	@GetMapping("/addlesson")
	public String addLesson()
	{
		return "addLesson";
		
	}
	
	@GetMapping("/TrainerHome")
	public String TrainerHome()
	{
		return "/TrainerHome";
		
	}
	
	@GetMapping("/StudentHome")
	public String StudentHome()
	{
		return "/StudentHome";
		
	}
	
	@GetMapping("/course")
	public String course()
	{
		return "/course";
		
	}
	@GetMapping("/Purchase")
	public String Purchase()
	{
		return "/Purchase";
		
	}
	@GetMapping("/MyCourse")
	public String MyCourse()
	{
		return "/MyCourse";
		
	}
	
	
	@GetMapping("/ViewComments")
	public String ViewComments()
	{
		return "/ViewComments";
		
	}
	
	// New Changes
	
	@GetMapping("/Index-1")
	public String indexs()
	{
		return "Index-1";
		
	}
	
	@GetMapping("/ExploreDev")
	public String ExploreDev()
	{
		return "ExploreDev";
		
	}
	
	@GetMapping("/ExploreTesting")
	public String ExploreTesting()
	{
		return "ExploreTesting";
		
	}
	
	@GetMapping("/About")
	public String About()
	{
		return "About";
		
	}
	
	@GetMapping("/Contact")
	public String Contact()
	{
		return "Contact";
		
	}
	
	@GetMapping("/Login-1")
	public String Login()
	{
		return "Login-1";
		
	}
	
	@GetMapping("/Register-1")
	public String Register()
	{
		return "Register-1";
		
	}
	
	@GetMapping("/Student")
	public String Student()
	{
		return "Student";
		
	}
	
	@GetMapping("/Payment")
	public String Payment()
	{
		return "Payment";
		
	}
	
	@GetMapping("/Course-1")
	public String Course()
	{
		return "/Course-1";
		
	}
	
	@GetMapping("/Trainer")
	public String Trainer()
	{
		return "/Trainer";
		
	}
	
	@GetMapping("/AddLesson-1")
	public String AddLesson()
	{
		return "/AddLesson-1";
		
	}
	
	@GetMapping("/DemoLesson")
	public String DemoLesson()
	{
		return "/DemoLesson";
		
	}
	
	@GetMapping("/TrainerView")
	public String TrainerView()
	{
		return "/TrainerView";
		
	}
}
