package com.LearnNext.Course.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LearnNext.Course.Entities.APITesting;
import com.LearnNext.Course.Entities.Automation;
import com.LearnNext.Course.Entities.BuildAndDeployment;
import com.LearnNext.Course.Entities.Database;
import com.LearnNext.Course.Entities.FrontendCourse;
import com.LearnNext.Course.Entities.JavaCourse;
import com.LearnNext.Course.Entities.ManualTesting;
import com.LearnNext.Course.Entities.PythonCourse;
import com.LearnNext.Course.Entities.Selenium;
import com.LearnNext.Course.Entities.SoftSkills;
import com.LearnNext.Course.Service.APITestingCourseService;
import com.LearnNext.Course.Service.AutomationTestingCourseService;
import com.LearnNext.Course.Service.BuildAndDeploymentCourseService;
import com.LearnNext.Course.Service.DatabseCourseService;
import com.LearnNext.Course.Service.FronEndCourseService;
import com.LearnNext.Course.Service.JavaCourseService;
import com.LearnNext.Course.Service.ManaulTestingCourseService;
import com.LearnNext.Course.Service.PythonCourseService;
import com.LearnNext.Course.Service.SeleniumCourseService;
import com.LearnNext.Course.Service.SoftSkillsAndApptitudeCourseService;

@Controller
public class CourseController 
{
	
	
	@Autowired
	JavaCourseService javacourseservice;
	
	@Autowired
	 PythonCourseService pythoncourseservice;
	
	@Autowired
	FronEndCourseService frontendcourseservice;
	
	@Autowired
	DatabseCourseService databasecourseservice;
	
	
	@Autowired
	BuildAndDeploymentCourseService buildanddeploymentcourseservice;
	
	
	@Autowired
	SoftSkillsAndApptitudeCourseService softskillsandapptitudecourseservice;
	
	@Autowired
	ManaulTestingCourseService manualtestingcourseservice;
	
	
	@Autowired
	AutomationTestingCourseService automationtestingtestingcourseservice;
	
	@Autowired
	SeleniumCourseService seleniumtestingcourseservice;
	
	@Autowired
	APITestingCourseService apitestingcourseservice;
	
	@PostMapping("/addJavaCourse")
	public String addCourse(
	        @RequestParam(value = "courseID", required = false) String courseID,
	        @RequestParam(value = "empID", required = false) String empID,
	        @RequestParam(value = "topicName", required = false) String topicName,
	        @RequestParam(value = "vedioContent", required = false) String vedioContent,
	        @RequestParam(value = "vedioUrls", required = false) String vedioUrls
	) {
	    try {
	        switch (courseID) {
	            case "JAV101":
	                JavaCourse javaCourse = new JavaCourse();
	                javaCourse.setCourseID(courseID);
	                javaCourse.setEmpID(empID);
	                javaCourse.setTopicName(topicName);
	                javaCourse.setVedioContent(vedioContent);
	                javaCourse.setVedioUrls(vedioUrls);
	                javacourseservice.addJavaCourse(javaCourse);
	                break;

	            case "PYT102":
	                PythonCourse paymentCourse = new PythonCourse();
	                paymentCourse.setCourseID(courseID);
	                paymentCourse.setEmpID(empID);
	                paymentCourse.setTopicName(topicName);
	                paymentCourse.setVedioContent(vedioContent);
	                paymentCourse.setVedioUrls(vedioUrls);
	                pythoncourseservice.addPythonCourse(paymentCourse);
	                break;

	           

	            case "UI-F103":
	                FrontendCourse frontEndCourse = new FrontendCourse();
	                frontEndCourse.setCourseID(courseID);
	                frontEndCourse.setEmpID(empID);
	                frontEndCourse.setTopicName(topicName);
	                frontEndCourse.setVedioContent(vedioContent);
	                frontEndCourse.setVedioUrls(vedioUrls);
	                frontendcourseservice.addFrontEndCourse(frontEndCourse);
	                break;

	            case "DBA104":
	                Database databaseCourse = new Database();
	                databaseCourse.setCourseID(courseID);
	                databaseCourse.setEmpID(empID);
	                databaseCourse.setTopicName(topicName);
	                databaseCourse.setVedioContent(vedioContent);
	                databaseCourse.setVedioUrls(vedioUrls);
	                databasecourseservice.addDatabaseCourse(databaseCourse);
	                break;

	            case "RM105":
	                BuildAndDeployment buildDeployCourse = new BuildAndDeployment();
	                buildDeployCourse.setCourseID(courseID);
	                buildDeployCourse.setEmpID(empID);
	                buildDeployCourse.setTopicName(topicName);
	                buildDeployCourse.setVedioContent(vedioContent);
	                buildDeployCourse.setVedioUrls(vedioUrls);
	                buildanddeploymentcourseservice.addBuildAndDeploymentCourse(buildDeployCourse);
	                break;

	            case "SSA106":
	                SoftSkills softSkillsCourse = new SoftSkills();
	                softSkillsCourse.setCourseID(courseID);
	                softSkillsCourse.setEmpID(empID);
	                softSkillsCourse.setTopicName(topicName);
	                softSkillsCourse.setVedioContent(vedioContent);
	                softSkillsCourse.setVedioUrls(vedioUrls);
	                softskillsandapptitudecourseservice.addSoftSkillsAndApptitudeCourse(softSkillsCourse);
	                break;

	            case "MNL107":
	                ManualTesting manualTestingCourse = new ManualTesting();
	                manualTestingCourse.setCourseID(courseID);
	                manualTestingCourse.setEmpID(empID);
	                manualTestingCourse.setTopicName(topicName);
	                manualTestingCourse.setVedioContent(vedioContent);
	                manualTestingCourse.setVedioUrls(vedioUrls);
	                manualtestingcourseservice.addManualTestingCourse(manualTestingCourse);
	                break;

	            case "ATS108":
	                Automation automationTestingCourse = new Automation();
	                automationTestingCourse.setCourseID(courseID);
	                automationTestingCourse.setEmpID(empID);
	                automationTestingCourse.setTopicName(topicName);
	                automationTestingCourse.setVedioContent(vedioContent);
	                automationTestingCourse.setVedioUrls(vedioUrls);
	                automationtestingtestingcourseservice.addAutomationTestingCourse(automationTestingCourse);
	                break;

	            case "SLN109":
	                Selenium seleniumCourse = new Selenium();
	                seleniumCourse.setCourseID(courseID);
	                seleniumCourse.setEmpID(empID);
	                seleniumCourse.setTopicName(topicName);
	                seleniumCourse.setVedioContent(vedioContent);
	                seleniumCourse.setVedioUrls(vedioUrls);
	                seleniumtestingcourseservice.addSeleniumCourse(seleniumCourse);
	                break;

	            case "API110":
	                APITesting apiCourse = new APITesting();
	                apiCourse.setCourseID(courseID);
	                apiCourse.setEmpID(empID);
	                apiCourse.setTopicName(topicName);
	                apiCourse.setVedioContent(vedioContent);
	                apiCourse.setVedioUrls(vedioUrls);
	                apitestingcourseservice.addAPITestingCourse(apiCourse);
	                break;

	            default:
	                throw new IllegalArgumentException("Invalid CourseID: " + courseID);
	        }

	        System.out.println("Received courseID: " + courseID);
	        System.out.println("Received empID: " + empID);

	    } catch (Exception e) {
	        // Log the exception message
	        System.err.println("Exception occurred: " + e.getMessage());

	        // Log the exact line number where the exception occurred
	        for (StackTraceElement element : e.getStackTrace()) {
	            System.err.println("at " + element);
	        }
	    }
	    return "Trainer";
	}
	
	
	  @GetMapping("/getAllCourses") public String getAllCourses(@RequestParam(value
	  = "courseID", required = false) String courseID, Model model) 
	  { 
		  try
		  { switch(courseID)
			  { 
	  case "JAV101": 
      List<JavaCourse> javaCourses =
	  javacourseservice.getAllJavaCourses(); model.addAttribute("courses",
	  javaCourses); break;
	  
	  
	  case "PYT102": List<PythonCourse> pythonCourses =
	  pythoncourseservice.getAllPaythonCourses(); model.addAttribute("courses",
	  pythonCourses); break;
	  
	  case "UI-F103": List<FrontendCourse> frontEndCourses =
	  frontendcourseservice.getAllFrontEndCourses(); model.addAttribute("courses",
	  frontEndCourses); break;
	  
	  case "DBA104": List<Database> databaseCourses =
	  databasecourseservice.getAllDatabaseCourses(); model.addAttribute("courses",
	  databaseCourses); break;
	  
	  case "RM105": List<BuildAndDeployment> buildDeployCourses =
	  buildanddeploymentcourseservice.getAllBuildAndDeployemntCourses();
	  model.addAttribute("courses", buildDeployCourses); break;
	  
	  case "SSA106": List<SoftSkills> softSkillsCourses =
	  softskillsandapptitudecourseservice.getAllSoftSkillsAndApptitudeCourse();
	  model.addAttribute("courses", softSkillsCourses); break;
	  
	  case "MNL107": List<ManualTesting> manualTestingCourses =
	  manualtestingcourseservice.getAllManualTestingCourses();
	  model.addAttribute("courses", manualTestingCourses); break;
	  
	  case "ATS108": List<Automation> automationTestingCourses =
	  automationtestingtestingcourseservice.getAllAutomationTestingCourse();
	  model.addAttribute("courses", automationTestingCourses); break;
	  
	  case "SLN109": List<Selenium> seleniumCourses =
	  seleniumtestingcourseservice.getAllSeleniumCourses();
	  model.addAttribute("courses", seleniumCourses); break;
	  
	  case "API110": List<APITesting> apiCourses =
	  apitestingcourseservice.getAllAPITestingCourses();
	  model.addAttribute("courses", apiCourses); break;
	  
	  default: throw new IllegalArgumentException("Invalid CourseID: " + courseID);
	  }
	  
	  } catch (Exception e) { // Log the exception
	  System.err.println("Exception occurred while fetching courses: " +
	  e.getMessage()); } return "TrainerView"; // Return the view name }
	  
	  
	  }
}
