package com.knoldus.studentgrading;
import java.util.Scanner;
public class StudentGrading {
     private double grade;
        public double getGrade(String password) {
            // To get authentication.
            if (password.equals("hello@knolder")) {
                return grade;
            } else {
                System.out.println("Invalid password!");
                return 0.0;
            }
        }
        protected void setGrade(double newGrade, String permissionLevel) {
            // authorization mechanism
            if (permissionLevel.equals("student")) {
                grade = newGrade;
            }
        }
    public static void main(String[] args) {
        StudentGrading studentGrading = new StudentGrading();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the role: ");
        String permissionlevel = scan.next();
        studentGrading.setGrade(10,permissionlevel);
        System.out.println("enter the password of your account: ");
        String password = scan.next();
        System.out.println("Grade is: "+studentGrading.getGrade(password));
    }
 }

