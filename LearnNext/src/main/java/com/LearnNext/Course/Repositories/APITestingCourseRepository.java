package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.APITesting;


public interface APITestingCourseRepository extends JpaRepository<APITesting, String>
{

	APITesting getById(String courseID);

}
