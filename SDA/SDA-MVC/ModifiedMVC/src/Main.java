/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa22-bse-067
 */
// File: Main.java
// File: Main.java
import Model.StudentModel;
import View.StudentView;
import Controller.StudentController;

public class Main {
    public static void main(String[] args) {
     
        StudentView view = new StudentView();

        // Create model instances for each student
        StudentModel student1 = new StudentModel("Hassan", "12345", 3.6);
        StudentModel student2 = new StudentModel("Ali", "12346", 3.8);
        StudentModel student3 = new StudentModel("Mashwani", "12347", 2.5);
        StudentModel student4 = new StudentModel("Aalyan", "12348", 2.8);
        StudentModel student5 = new StudentModel("Ghazi", "12349", 1.9);

       
        StudentController controller1 = new StudentController(student1, view);
        StudentController controller2 = new StudentController(student2, view);
        StudentController controller3 = new StudentController(student3, view);
        StudentController controller4 = new StudentController(student4, view);
        StudentController controller5 = new StudentController(student5, view);

       
        controller1.updateView();
        controller2.updateView();
        controller3.updateView();
        controller4.updateView();
        controller5.updateView();
    }
}
