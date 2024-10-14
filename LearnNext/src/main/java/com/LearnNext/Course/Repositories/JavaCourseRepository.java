package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.JavaCourse;


public interface JavaCourseRepository extends JpaRepository<JavaCourse, String>
{

	JavaCourse getById(String courseID);

}
