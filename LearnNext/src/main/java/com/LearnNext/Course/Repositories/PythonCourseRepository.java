package com.LearnNext.Course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.PythonCourse;

public interface PythonCourseRepository extends JpaRepository<PythonCourse, String>
{
	PythonCourse getById(String courseID);


}
