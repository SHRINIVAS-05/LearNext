package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Repositories.JavaCourseRepository;

@Service
public class JavaCourseImplimentation  implements JavaCourseService
{
	@Autowired
	JavaCourseRepository javacourserepository;
    
	
	// To add Course
	@Override
	public String addJavaCourse(JavaCourse javacourse) 
	{
		try
		{
		// TODO Auto-generated method stub
		javacourserepository.save(javacourse);
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
	public List<JavaCourse> getAllJavaCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<JavaCourse> courseList = javacourserepository.findAll();
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
		return javacourserepository.findAll();
	}
}
