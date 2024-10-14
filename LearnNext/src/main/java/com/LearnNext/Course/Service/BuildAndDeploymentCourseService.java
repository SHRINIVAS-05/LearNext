package com.LearnNext.Course.Service;

import java.util.List;

import com.LearnNext.Course.Entities.BuildAndDeployment;

public interface BuildAndDeploymentCourseService 
{
	String addBuildAndDeploymentCourse(BuildAndDeployment buildanddeploymentcourse);

	List<BuildAndDeployment> getAllBuildAndDeployemntCourses();

	
	
			
}
