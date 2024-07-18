// Problem Statement: Top K Students by Marks

// You need to write a program that reads a list of students with their marks and prints the top K students based on their marks.

// Input:

// The program expects input in the form of a single line containing space-separated values:
// The first value is an integer k, indicating the number of top students to print.
// The subsequent values are alternating integers representing marks followed by strings representing student names.
// Output:

// Print the names and marks of the top K students based on their marks, sorted in descending order of marks.
// Example:

// Input:
// 3 90 Alice 85 Bob 95 Charlie 88 David 92 Eve
// Output:
// Charlie: 95
// Eve: 92
// David: 88

// Here's a problem statement for your TopKStudents Java program along with an explanation:

// Problem Statement: Top K Students by Marks

// You need to write a program that reads a list of students with their marks and prints the top K students based on their marks.

// Input:

// The program expects input in the form of a single line containing space-separated values:
// The first value is an integer k, indicating the number of top students to print.
// The subsequent values are alternating integers representing marks followed by strings representing student names.
// Output:

// Print the names and marks of the top K students based on their marks, sorted in descending order of marks.
// Example:

// Input:

// Copy code
// 3 90 Alice 85 Bob 95 Charlie 88 David 92 Eve
// Output:

// makefile
// Copy code
// Charlie: 95
// Eve: 92
// David: 88
// Explanation:

// In the input, k = 3, and the list of students with their marks is provided.
// The top 3 students by marks are Charlie (95), Eve (92), and David (88).
// Therefore, the program prints these students in descending order of marks along with their respective marks
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TopKStudents {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String [] str=sc.nextLine().split(" ");

    }

    public static void printTopKStudents(String[] input) {
   int k=Integer.parseInt(input[0]);
    List<Student> students = new ArrayList<>();
       
    for (int i = 0; i < input.length; i+=2) {
        String name=input[i+1];
        int marks=Integer.parseInt(input[i]);
        students.add(new Student(name, marks));
    }

     Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

     for (int i = 0; i < k && i < students.size(); i++) {
        Student student = students.get(i);
        System.out.println(student.name + ": " + student.marks);
    }
    }

    static class Student {
        String name;
        int marks;

        

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }
}
