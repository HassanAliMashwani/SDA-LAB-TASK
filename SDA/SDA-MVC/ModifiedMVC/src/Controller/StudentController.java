/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author fa22-bse-067
 */
// File: StudentController.java


import Model.StudentModel;
import View.StudentView;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    // Constructor to initialize the controller with the model and view
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Set student details
    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentRegNo(String regNo) {
        model.setRegNo(regNo);
    }

    public void setStudentGpa(double gpa) {
        model.setGpa(gpa);
    }

    // Get student details
    public String getStudentName() {
        return model.getName();
    }

    public String getStudentRegNo() {
        return model.getRegNo();
    }

    public double getStudentGpa() {
        return model.getGpa();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    // Update the view with the current student data
    public void updateView() {
        view.printStudentDetails(
            model.getName(),
            model.getRegNo(),
            model.getGpa(),
            model.getGrade()
        );
    }
}
