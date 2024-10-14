package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.Selenium;
import com.LearnNext.Course.Repositories.JavaCourseRepository;
import com.LearnNext.Course.Repositories.SeleniumCourseRepository;

@Service
public class SeleniumCourseServiceImp  implements SeleniumCourseService
{
	@Autowired
	   SeleniumCourseRepository seleniumcourserepository;
    
	
	// To add Course
	@Override
	public String addSeleniumCourse(Selenium seleniumcourse) 
	{
		try
		{
		// TODO Auto-generated method stub
			seleniumcourserepository.save(seleniumcourse);
		}
		catch (Exception e) {
	        // Log the exception message
	        System.err.println("Exception occurred: " + e.getMessage());

	        // Log the exact line number where the exception occurred
	        for (StackTraceElement element : e.getStackTrace()) {
	            System.err.println("at " + element);
	        }
	    }
		return "JavaCourse was added successfully";
	}

	
	
	// Get Course By 
	@Override
	public List<Selenium> getAllSeleniumCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<Selenium> courseList = seleniumcourserepository.findAll();
		System.out.println(courseList);
		}
		catch (Exception e) {
	        // Log the exception message
	        System.err.println("Exception occurred: " + e.getMessage());

	        // Log the exact line number where the exception occurred
	        for (StackTraceElement element : e.getStackTrace()) {
	            System.err.println("at " + element);
	        }
	    }
		return seleniumcourserepository.findAll();
	}
}
