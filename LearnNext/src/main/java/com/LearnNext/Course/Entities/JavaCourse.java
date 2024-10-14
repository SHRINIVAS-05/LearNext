package com.LearnNext.Course.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "java_course")
public class JavaCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String empID;
    private String courseID;
    private String topicName;
    private String vedioContent;
    private String vedioUrls;

    // Constructors, getters, and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getVedioContent() {
        return vedioContent;
    }

    public void setVedioContent(String vedioContent) {
        this.vedioContent = vedioContent;
    }

    public String getVedioUrls() {
        return vedioUrls;
    }

    public void setVedioUrls(String vedioUrls) {
        this.vedioUrls = vedioUrls;
    }
    
    @Override
    public String toString() {
        return "JavaCourse [id=" + id + ", empID=" + empID + ", courseID=" + courseID + ", topicName=" + topicName
                + ", vedioContent=" + vedioContent + ", vedioUrls=" + vedioUrls + "]";
    }
}
