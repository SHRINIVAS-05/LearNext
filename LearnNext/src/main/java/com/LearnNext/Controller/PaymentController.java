package com.LearnNext.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.LearnNext.Entity.Payment;
import com.LearnNext.Service.PaymentService;

@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;     

    @PostMapping("/processPayment")
/*    public String processPayment(
            @RequestParam (value="studentId",required = false)String studentId,
            @RequestParam (value="courseSelection",required = false)String courseSelection,
            @RequestParam (value="techSelection",required = false)String techSelection,
            @RequestParam (value="price",required = false)String price,
            @RequestParam (value="courseId",required = false)String courseId,
            @RequestParam (value="cardHolderName",required = false)String cardHolderName,
            @RequestParam (value="cardNumber",required = false)String cardNumber,
            @RequestParam (value="expiryDate",required = false)String expiryDate,
            @RequestParam (value="cvv",required = false)String cvv,
            @RequestParam (value="billingAddress",required = false)String billingAddress) */
    public String processPayment(
            @RequestParam String studentId,
            @RequestParam String courseSelection,
            @RequestParam String techSelection,
            @RequestParam String price,
            @RequestParam String courseId,
            @RequestParam String cardHolderName,
            @RequestParam String cardNumber,
            @RequestParam String expiryDate,
            @RequestParam String cvv,
            @RequestParam String billingAddress)
    {

        Payment payment = new Payment();
        payment.setStudentId(studentId);
        payment.setCourseSelection(courseSelection);
        payment.setTechSelection(techSelection);
        payment.setPrice(price);
        payment.setCourseId(courseId);
        payment.setCardHolderName(cardHolderName);
        payment.setCardNumber(cardNumber);
        payment.setExpiryDate(expiryDate);
        payment.setCvv(cvv);
        payment.setBillingAddress(billingAddress);

       Payment pay = paymentService.savePayment(payment);
       System.out.println(pay);

        //return "paymentSuccess"; // Return the view name for payment success page
       return "/Student";
    }
    
    
    
	/*
	 * @PostMapping("/StudentPayment") public String validation(@RequestParam String
	 * studentId,
	 * 
	 * @RequestParam String courseId, RedirectAttributes redirectAttributes) {
	 * System.out.println("Received Student ID: " + studentId);
	 * System.out.println("Received Course ID: " + courseId);
	 * 
	 * // Validate if the student has already purchased a course boolean
	 * isCoursePurchased = paymentService.validateStudent(studentId);
	 * 
	 * // Validate if the course ID is valid boolean isCourseValid =
	 * paymentService.validateCourse(courseId);
	 * 
	 * // Check if the student has already purchased this specific course if
	 * (isCoursePurchased && isCourseValid) {
	 * redirectAttributes.addFlashAttribute("message",
	 * "Already purchased this course. Please check the Course section."); return
	 * "redirect:/Student"; }
	 * 
	 * // Proceed with the payment processing if not already purchased // Your
	 * payment processing logic here...
	 * 
	 * return "redirect:/Payment?success"; }
	 */

    

    @PostMapping("/StudentPayment")
    public String validation(@RequestParam String studentId, 
                             @RequestParam String courseId, 
                             RedirectAttributes redirectAttributes) {

        System.out.println("Received Student ID: " + studentId);
        System.out.println("Received Course ID: " + courseId);
        
        // Validate if the student has already purchased this specific course
        boolean isCourseAlreadyPurchased = paymentService.validateStudentCourseCombination(studentId, courseId);
        System.out.println(isCourseAlreadyPurchased);

        if (isCourseAlreadyPurchased) {
            redirectAttributes.addFlashAttribute("message", "You have already purchased this course. Please check your courses section.");
            return "redirect:/Student"; // Redirect to the Student page with a message
        }

        // Redirect to payment page to complete the purchase
        redirectAttributes.addAttribute("studentId", studentId);
        redirectAttributes.addAttribute("courseId", courseId);
        return "redirect:/Payment";
    }
    
}
