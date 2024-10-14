package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.ManualTesting;


public interface ManualTestingCourseRepository extends JpaRepository<ManualTesting, String>
{

	ManualTesting getById(String courseID);

}
