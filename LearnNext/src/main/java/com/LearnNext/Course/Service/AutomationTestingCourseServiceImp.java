package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.APITesting;
import com.LearnNext.Course.Entities.Automation;
import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Repositories.AutomationTestingCourseRepository;
import com.LearnNext.Course.Repositories.JavaCourseRepository;

@Service
public class AutomationTestingCourseServiceImp  implements AutomationTestingCourseService
{
	@Autowired
	AutomationTestingCourseRepository automationtestingcourserepository;
    
	
	// To add Course
	@Override
	public String addAutomationTestingCourse(Automation automationtestingcourse)
	{
		try
		{
		// TODO Auto-generated method stub
		automationtestingcourserepository.save(automationtestingcourse);
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

	
	
	// Get Course 
	@Override
	public List<Automation> getAllAutomationTestingCourse()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<Automation> courseList = automationtestingcourserepository.findAll();
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
		return automationtestingcourserepository.findAll();
	}
}
