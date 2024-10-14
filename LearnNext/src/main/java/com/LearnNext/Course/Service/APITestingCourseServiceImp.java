package com.LearnNext.Course.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.APITesting;
import com.LearnNext.Course.Repositories.APITestingCourseRepository;

@Service
public class APITestingCourseServiceImp  implements APITestingCourseService
{
	@Autowired
	APITestingCourseRepository apitestingcourserepository;
    
	
	// To add Course
	@Override
	public String addAPITestingCourse(APITesting apitestingcourse) 
	{
		try
		{
		// TODO Auto-generated method stub
		apitestingcourserepository.save(apitestingcourse);
		}
		catch (Exception e) {
	        // Log the exception message
	        System.err.println("Exception occurred: " + e.getMessage());

	        // Log the exact line number where the exception occurred
	        for (StackTraceElement element : e.getStackTrace()) {
	            System.err.println("at " + element);
	        }
	    }
		return "APITestingCourse was added successfully";
	}

	
	
	// Get Courses
	@Override
	public List<APITesting> getAllAPITestingCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<APITesting> courseList = apitestingcourserepository.findAll();
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
		return apitestingcourserepository.findAll();
	}
}
