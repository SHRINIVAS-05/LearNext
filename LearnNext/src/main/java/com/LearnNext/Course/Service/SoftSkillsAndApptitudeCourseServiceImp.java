package com.LearnNext.Course.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.SoftSkills;
import com.LearnNext.Course.Repositories.JavaCourseRepository;
import com.LearnNext.Course.Repositories.SoftSkillsAndApptitudeCourseRepository;

@Service
public class SoftSkillsAndApptitudeCourseServiceImp  implements SoftSkillsAndApptitudeCourseService
{
	@Autowired
	SoftSkillsAndApptitudeCourseRepository softskillsandapptitudecourserepository;
    
	
	// To add Course
	@Override
	public String addSoftSkillsAndApptitudeCourse(SoftSkills softskillsandapptitudecourse)
	{
		try
		{
		// TODO Auto-generated method stub
			softskillsandapptitudecourserepository.save(softskillsandapptitudecourse);
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
	public List<SoftSkills> getAllSoftSkillsAndApptitudeCourse()
	{
		try
		{
		// TODO Auto-generated method stub
			 List<SoftSkills> courseList = softskillsandapptitudecourserepository.findAll();
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
		return softskillsandapptitudecourserepository.findAll();
	}
}
