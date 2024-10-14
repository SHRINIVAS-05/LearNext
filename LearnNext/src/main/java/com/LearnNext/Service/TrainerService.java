package com.LearnNext.Service;

import java.util.List;

import com.LearnNext.Entity.Course;
import com.LearnNext.Entity.Lesson;

public interface TrainerService {

	public String addCourse(Course course);

	public String addLesson(Lesson lesson);

	public Course getCourse(int CourseId);

	public List<Course> courseList();

}
