package com.LearnNext.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LearnNext.Entity.Course;
import com.LearnNext.Entity.Lesson;
import com.LearnNext.Service.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService trainerservice;
	@PostMapping("/CreateCourse")
	public String CreateCourse(@RequestParam("courseId") int courseId,
			                   @RequestParam("courseName") String courseName,
			                   @RequestParam("coursePriceId") int coursePriceId)

	{
		Course c= new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePriceId(coursePriceId);
		trainerservice.addCourse(c);
		System.out.println(courseId + courseName + coursePriceId);
		return "redirect:/";
	}
	
	
	@PostMapping("/lesson")
	public String lesson(@RequestParam("courseId")int CourseId,
			@RequestParam("lessonId")int lessonId,
			@RequestParam("lessonName")String lessonName,
			@RequestParam("topic")String lessonTopics,
			@RequestParam("videoLink")String link)
	
	{
    	Course course=trainerservice.getCourse(CourseId);
		Lesson lesson=new Lesson(lessonId,lessonName,lessonTopics,link,course);
		trainerservice.addLesson(lesson);
		course.getLessons().add(lesson);
		System.out.println(CourseId +lessonId+lessonName+lessonTopics+link);
		return "redirect:/";
		
	}
	
	@GetMapping("/showCourses")
	public String showCourses(Model model)
	{
		List<Course> courseList=trainerservice.courseList();
		model.addAttribute("courseList",courseList);
		//System.out.println(courseList);
		return "course";
		
		
		
	}

}
