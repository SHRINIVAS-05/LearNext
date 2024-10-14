package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.PythonCourse;
import com.LearnNext.Course.Repositories.JavaCourseRepository;
import com.LearnNext.Course.Repositories.PythonCourseRepository;

@Service
public class PythonCourseServiceImp  implements PythonCourseService
{
	@Autowired
	PythonCourseRepository pythoncourserepository;
    
	
	// To add Course
	@Override
	public String addPythonCourse(PythonCourse pythoncourse)
	{
		try
		{
		// TODO Auto-generated method stub
			pythoncourserepository.save(pythoncourse);
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
	public List<PythonCourse> getAllPaythonCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<PythonCourse> courseList = pythoncourserepository.findAll();
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
		return pythoncourserepository.findAll();
	}
}
