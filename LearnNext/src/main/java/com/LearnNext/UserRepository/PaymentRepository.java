package com.LearnNext.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>
{
	
	 
    // Custom query method to check if a record exists with given StudentID and CourseID
    boolean existsByStudentId(String studentId);
    boolean existsByCourseId( String courseId);
    
 // Custom query method to check if a record exists with the given StudentID and CourseID combination
    boolean existsByStudentIdAndCourseId(String studentId, String courseId);

	
}
