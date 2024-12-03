/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author fa22-bse-067
 */
// File: StudentView.java
public class StudentView {

    // Method to print student details
    public void printStudentDetails(String name, String regNo, double gpa, String grade) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
}
