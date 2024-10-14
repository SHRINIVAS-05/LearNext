package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.SoftSkills;


public interface SoftSkillsAndApptitudeCourseRepository extends JpaRepository<SoftSkills, String>
{

	SoftSkills getById(String courseID);

}
