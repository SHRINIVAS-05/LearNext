package com.LearnNext.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Entity.Lesson;
import com.LearnNext.UserRepository.LessonRepository;

@Service
public class StudentServiceImplimentation implements StudentService{

	@Autowired
	LessonRepository lrepo;
	@Override
	public Lesson getLesson(int lessonId) 
	{
		return lrepo.findById(lessonId).get();
	}

	
}
