package com.LearnNext.Entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Course 
{
	@Id
	int courseId;
	String courseName;
	public int coursePriceId;
	@OneToMany
	List<Lesson> lessons;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, int coursePriceId, List<Lesson> lessons) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePriceId = coursePriceId;
		this.lessons = lessons;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePriceId() {
		return coursePriceId;
	}
	public void setCoursePriceId(int coursePriceId) {
		this.coursePriceId = coursePriceId;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
//	@Override
//	public String toString() {
//		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePriceId=" + coursePriceId
//				+ ", lessons=" + lessons + "]";
//	}
	
	// Course class
	@Override
	public String toString() {
	    return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePriceId=" + coursePriceId
	            + ", lessons=" + lessons + "]"; // Just printing lessons list without invoking their toString() methods
	}
	
	
	

}
