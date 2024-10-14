package com.LearnNext.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}
