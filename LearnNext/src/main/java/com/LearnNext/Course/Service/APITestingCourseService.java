package com.LearnNext.Course.Service;

import java.util.List;

import com.LearnNext.Course.Entities.APITesting;

public interface APITestingCourseService 
{
	String addAPITestingCourse(APITesting apitestingcourse);

	List<APITesting> getAllAPITestingCourses();

	
	
			
}
