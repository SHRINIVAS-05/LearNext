package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.ManualTesting;
import com.LearnNext.Course.Repositories.JavaCourseRepository;
import com.LearnNext.Course.Repositories.ManualTestingCourseRepository;

@Service
public class ManaulTestingCourseServiceImp  implements ManaulTestingCourseService
{
	@Autowired
	ManualTestingCourseRepository manualtestingcourserepository;
    
	
	// To add Course
	@Override
	public String addManualTestingCourse(ManualTesting manualtestingcourse)
	{
		try
		{
		// TODO Auto-generated method stub
			manualtestingcourserepository.save(manualtestingcourse);
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
	public 	List<ManualTesting> getAllManualTestingCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<ManualTesting> courseList = manualtestingcourserepository.findAll();
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
		return manualtestingcourserepository.findAll();
	}
}
