package com.LearnNext.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Entity.Payment;
import com.LearnNext.UserRepository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
    
    // Method to check if StudentID and CourseID exist in the database
    public boolean validateStudent(String studentId) {
        return paymentRepository.existsByStudentId(studentId);
    }
    
    public boolean validateCourse(String courseId) {
        return paymentRepository.existsByCourseId( courseId);
    }
    
    // Validate if a student has already purchased a specific course
    public boolean validateStudentCourseCombination(String studentId, String courseId) {
        return paymentRepository.existsByStudentIdAndCourseId(studentId, courseId);
    }
    
}

