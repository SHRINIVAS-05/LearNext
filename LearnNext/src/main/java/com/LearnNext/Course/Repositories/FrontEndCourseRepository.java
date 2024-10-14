package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.FrontendCourse;


public interface FrontEndCourseRepository extends JpaRepository<FrontendCourse, String>
{

	FrontendCourse getById(String courseID);

}
