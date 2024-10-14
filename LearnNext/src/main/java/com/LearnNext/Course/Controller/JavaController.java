/*
 * package com.LearnNext.Course.Controller;
 * 
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.ui.Model;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * com.LearnNext.Course.Entities.JavaCourse; import
 * com.LearnNext.Course.Service.JavaCourseService;
 * 
 * @Controller public class JavaController {
 * 
 * @Autowired JavaCourseService javacourseservice;
 * 
 * 
 * @PostMapping("/addJavaCourse") public String addJavaCourse(
 * 
 * @RequestParam (value="courseID",required = false)String courseID,
 * //@RequestParam ("empID")String empID,
 * 
 * @RequestParam(value = "empID", required = false) String empID,
 * 
 * @RequestParam(value = "topicName", required = false) String topicName,
 * 
 * @RequestParam (value="vedioContent",required=false)String vedioContent,
 * 
 * @RequestParam (value="vedioUrls",required = false)String vedioUrls ) {
 * 
 * try {
 * 
 * JavaCourse JavaCourse = new JavaCourse(); JavaCourse.setCourseID(courseID);
 * JavaCourse.setEmpID(empID); JavaCourse.setTopicName(topicName);
 * JavaCourse.setVedioContent(vedioContent); JavaCourse.setVedioUrls(vedioUrls);
 * javacourseservice.addJavaCourse(JavaCourse);
 * System.out.println("Received courseID: " + courseID);
 * System.out.println("Received empID: " + empID);
 * 
 * 
 * 
 * } catch (Exception e) { // Log the exception message
 * System.err.println("Exception occurred: " + e.getMessage());
 * 
 * // Log the exact line number where the exception occurred for
 * (StackTraceElement element : e.getStackTrace()) { System.err.println("at " +
 * element); } } return "Trainer";
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * // New Get Method to Fetch All JavaCourse Entries
 * 
 * @GetMapping("/getAllJavaCourses") public String getAllJavaCourses(Model
 * model) { try { List<JavaCourse> courses =
 * javacourseservice.getAllJavaCourses(); model.addAttribute("courses",
 * courses); // Add the courses list to the model } catch (Exception e) { // Log
 * the exception
 * System.err.println("Exception occurred while fetching courses: " +
 * e.getMessage()); } return "TrainerView"; // Return the view name }
 * 
 * 
 * }
 */