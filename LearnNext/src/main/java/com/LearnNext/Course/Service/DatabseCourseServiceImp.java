package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.Database;
import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Repositories.DatabaseCourseRepository;
import com.LearnNext.Course.Repositories.JavaCourseRepository;

@Service
public class DatabseCourseServiceImp  implements DatabseCourseService
{
	@Autowired
	DatabaseCourseRepository databsecourserepository;
    
	
	// To add Course
	@Override
	   public String addDatabaseCourse(Database databasecourse) 
	{
		try
		{
		// TODO Auto-generated method stub
			databsecourserepository.save(databasecourse);
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
	public List<Database> getAllDatabaseCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<Database> courseList = databsecourserepository.findAll();
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
		return databsecourserepository.findAll();
	}
}
