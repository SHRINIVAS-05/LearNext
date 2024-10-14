package com.LearnNext.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Entity.Course;
import com.LearnNext.Entity.Lesson;
import com.LearnNext.UserRepository.CourseRepository;
import com.LearnNext.UserRepository.LessonRepository;

@Service
public class TrainerServiceImplimentation implements TrainerService{

	@Autowired
	CourseRepository courserepo;
	
	@Autowired
	LessonRepository lessonrepo;

	@Override
	public String addCourse(Course course) {
		
		courserepo.save(course);
		return "Course added successfully";
	}

	@Override
	public String addLesson(Lesson lesson) {
		
		lessonrepo.save(lesson);
		return "Lesson added successfully";
	}

	@Override
	public Course getCourse(int CourseId) {
		// TODO Auto-generated method stub
		return courserepo.findById(CourseId).get();
		 
	
	}

	@Override
	public List<Course> courseList() {
		 return courserepo.findAll();
	
	}

}
