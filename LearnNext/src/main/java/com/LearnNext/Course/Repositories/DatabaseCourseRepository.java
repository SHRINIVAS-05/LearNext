package com.LearnNext.Course.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Course.Entities.Database;


public interface DatabaseCourseRepository extends JpaRepository<Database, String>
{

	Database getById(String courseID);

}
