package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.BuildAndDeployment;
import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Repositories.BuildAndDeploymentCourseRepository;
import com.LearnNext.Course.Repositories.JavaCourseRepository;

@Service
public class BuildAndDeploymentCourseServiceImp  implements BuildAndDeploymentCourseService
{
	@Autowired
	BuildAndDeploymentCourseRepository buildanddeploymentcourserepository;
    
	
	// To add Course
	@Override
	public 	String addBuildAndDeploymentCourse(BuildAndDeployment buildanddeploymentcourse)

	{
		try
		{
		// TODO Auto-generated method stub
			buildanddeploymentcourserepository.save(buildanddeploymentcourse);
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
	public List<BuildAndDeployment> getAllBuildAndDeployemntCourses()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<BuildAndDeployment> courseList = buildanddeploymentcourserepository.findAll();
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
		return buildanddeploymentcourserepository.findAll();
	}
}
