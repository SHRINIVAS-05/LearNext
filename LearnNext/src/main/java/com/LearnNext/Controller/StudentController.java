package com.LearnNext.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LearnNext.Entity.Lesson;
import com.LearnNext.Service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService Studentservice;
	
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lessonId")int lessonId, Model mod)
	{
		Lesson lesson = Studentservice.getLesson(lessonId);
		mod.addAttribute("lesson",lesson);
		//System.out.println(lessonLessonList);
		
		
		return "MyLesson";
		
	}

}
