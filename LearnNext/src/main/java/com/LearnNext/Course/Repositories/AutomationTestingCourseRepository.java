package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.Automation;


public interface AutomationTestingCourseRepository extends JpaRepository<Automation, String>
{

	Automation getById(String courseID);

}

