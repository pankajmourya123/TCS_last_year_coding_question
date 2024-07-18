// The provided code is a Java program that processes student records to identify students older than 20 years and calculates the average ASCII value of grades for female students.

// ### Problem Description

// Write a program that:
// 1. Reads data for several students.
// 2. Identifies and prints the names of students who are older than 20 years.
// 3. Calculates and displays the average ASCII value of grades for female students, rounded to two decimal places.

// **Input Format:**
// - The first line contains an integer `n`, the number of students.
// - Each of the next `n` lines contains:
//   - The student's name (a single word),
//   - Their age (an integer),
//   - Their grade (a single character),
//   - Their gender ("male" or "female").

// **Output Format:**
// - Print the names of all students older than 20 years in a single line separated by spaces.
// - Print the average ASCII value of grades for female students, rounded to two decimal places.

// **Example:**

// **Input:**
// ```
// 3
// Alice 21 A female
// Bob 19 B male
// Clara 22 C female
// ```

// **Output:**
// ```
// Alice Clara 
// 65.50
// ```

// In this example:
// - There are 3 students: Alice, Bob, and Clara.
// - Alice and Clara are older than 20, so their names are printed.
// - The average ASCII value of grades for female students (Alice and Clara) is calculated as follows:
//   - ASCII value of 'A' is 65
//   - ASCII value of 'C' is 67
//   - Average = (65 + 67) / 2 = 66.00

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking the input for number of students
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Initialize lists to store names and calculate total ASCII values for grades
        List<String> names = new ArrayList<>();
        int totalFemaleGrade = 0;
        int femaleCount = 0;
        
        // Process each student record
        for (int i = 0; i < n; i++) {
            // Read the entire line and split by space
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            
            // Extract the data fields
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            char grade = parts[2].charAt(0);
            String gender = parts[3];
            
            // Check if the student is older than 20 and add to the names list
            if (age > 20) {
                names.add(name);
            }
            
            // If the student is female, add the ASCII value of their grade to the total
            if (gender.equalsIgnoreCase("female")) {
                totalFemaleGrade += (int) grade;
                femaleCount++;
            }
        }
        
        // Calculate the average grade for female students
        double averageGrade = (double) totalFemaleGrade / femaleCount;
        
        // Print the names of students older than 20
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // Print the average grade of female students
        System.out.println(averageGrade);
    }
}
