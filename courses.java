/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.balex;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class courses {
    
    // Declare course variables
    private static final String[] courseNames = {"Software Engineering", "Information Technology", "Computer Science", "Computer Engineering"};
    private static final String[] courseIDs = {"BSE", "BIT", "BCS", "BCE"};
    private static final int[] tuitions = {900000, 750000, 800000, 950000};

    // Method to get course details by CourseID
    public static String getCourseDetails(String courseID) {
        for (int i = 0; i < courseIDs.length; i++) {
            if (courseIDs[i].equalsIgnoreCase(courseID)) {
                return "Course: " + courseNames[i] + "\nTuition: " + tuitions[i];
            }
        }
        return "Wrong CourseID details";
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CourseID: ");
        String courseID = scanner.nextLine();

        String courseDetails = getCourseDetails(courseID);
        System.out.println(courseDetails);
    }
}


