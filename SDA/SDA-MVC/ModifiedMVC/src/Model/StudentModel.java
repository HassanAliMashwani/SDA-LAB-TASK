/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fa22-bse-067
 */
// File: StudentModel.java

public class StudentModel {
    private String name;
    private String regNo;
    private double gpa;
    private String grade;

    // Constructor
    public StudentModel(String name, String regNo, double gpa) {
        this.name = name;
        this.regNo = regNo;
        this.gpa = gpa;
        this.grade = calculateGrade(gpa);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        this.grade = calculateGrade(gpa);
    }

    public String getGrade() {
        return grade;
    }

    // Method to calculate grade based on GPA
    private String calculateGrade(double gpa) {
        if (gpa >= 3.5) {
            return "A";
        } else if (gpa >= 3.0) {
            return "B";
        } else if (gpa >= 2.7) {
            return "C";
        } else if (gpa >= 2.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
