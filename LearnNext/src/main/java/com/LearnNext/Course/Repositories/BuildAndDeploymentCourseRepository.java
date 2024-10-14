package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.BuildAndDeployment;


public interface BuildAndDeploymentCourseRepository extends JpaRepository<BuildAndDeployment, String>
{

	BuildAndDeployment getById(String courseID);

}
