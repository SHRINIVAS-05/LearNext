package com.LearnNext.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentId;
    private String courseSelection;
    private String techSelection;
    private String price;
    private String courseId;
    private String cardHolderName;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String billingAddress;
    private LocalDateTime dateAndTime;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseSelection() {
        return courseSelection;
    }

    public void setCourseSelection(String courseSelection) {
        this.courseSelection = courseSelection;
    }

    public String getTechSelection() {
        return techSelection;
    }

    public void setTechSelection(String techSelection) {
        this.techSelection = techSelection;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    
    // Constructor
    public Payment() {
        this.dateAndTime = LocalDateTime.now();  // Capture the current date and time
    }

    // Getters and Setters
    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", courseSelection='" + courseSelection + '\'' +
                ", techSelection='" + techSelection + '\'' +
                ", price='" + price + '\'' +
                ", courseId='" + courseId + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                '}';
    }
}
