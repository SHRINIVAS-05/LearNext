package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.FrontendCourse;
import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Repositories.FrontEndCourseRepository;
import com.LearnNext.Course.Repositories.JavaCourseRepository;

@Service
public class FronEndCourseServiceImp  implements FronEndCourseService
{
	@Autowired
	FrontEndCourseRepository frontendcourserepository;
    
	
	// To add Course
	@Override
	public String addFrontEndCourse(FrontendCourse frontendcourse) 
	{
		try
		{
		// TODO Auto-generated method stub
			frontendcourserepository.save(frontendcourse);
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
	public List<FrontendCourse> getAllFrontEndCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<FrontendCourse> courseList = frontendcourserepository.findAll();
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
		return frontendcourserepository.findAll();
	}
}
