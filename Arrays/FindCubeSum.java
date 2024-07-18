// The provided code is a Java program that calculates the sum of the cubes of integers within a given range, inclusive of the start and end values.

// ### Problem Description

// Write a program that:
// 1. Reads a start and end value from the user.
// 2. Calculates the sum of the cubes of all integers between the start and end values, inclusive.
// 3. Prints the resulting sum.

// **Input Format:**
// - Two integers representing the start and end of the range.

// **Output Format:**
// - A single integer representing the sum of the cubes of all integers in the specified range.

// **Steps:**
// 1. Read the start and end values from the user input.
// 2. Calculate the sum of the cubes of all integers from the start to the end value.
// 3. Print the resulting sum.

// **Example:**

// **Input:**
// ```
// Enter start 
// 1
// Enter End 
// 3
// ```

// **Output:**
// ```
// 36
// ```

// **Explanation:**
// - The integers in the range from 1 to 3 are 1, 2, and 3.
// - The cubes are \(1^3 = 1\), \(2^3 = 8\), and \(3^3 = 27\).
// - The sum of the cubes is \(1 + 8 + 27 = 36\).








import java.util.Scanner;

public class FindCubeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter start ");

        int s=sc.nextInt();


        System.out.println("Enter End ");
        int e=sc.nextInt();

        int sum= findCubeSum(s,e);
        System.out.println(sum);
    }

    public static int findCubeSum(int s,int e){
        int cubesum=0;
        for (int i = s; i <= e; i++) {
            cubesum+=Math.pow(i,3);
        }

        return cubesum;
    }
}
