package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.Selenium;


public interface SeleniumCourseRepository extends JpaRepository<Selenium, String>
{

	Selenium getById(String courseID);

}
