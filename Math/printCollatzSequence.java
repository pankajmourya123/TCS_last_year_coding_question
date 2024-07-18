// Problem Statement: Collatz Sequence Generator
// Create a Java program that generates and prints the Collatz sequence for a given positive integer N.

// Steps:
// Input:

// Accept a positive integer N from the user.
// Validate that N is greater than 0. If N is not positive, display an error message and terminate.
// Process:

// Generate the Collatz sequence starting from N until you reach 1.
// For each number in the sequence:
// Print the number.
// If the number is even, divide it by 2.
// If the number is odd, multiply it by 3 and add 1.
// Output:

// Print the Collatz sequence for N starting from N down to 1.
// Example:
// Input
// N = 12
// Process
// Collatz sequence for 12:
// 12 → 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
// Output
// Collatz sequence for 12: 12 6 3 10 5 16 8 4 2 1


package Math;

import java.util.Scanner;

public class printCollatzSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number (N) to generate its Collatz sequence: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Error! Please enter a positive integer.");
            return;
        }
        
        System.out.print("Collatz sequence for " + n + ": ");
        printCollatzSequence(n);
    }
    public static void printCollatzSequence(int n){
        while (n!=1) {
            System.out.print(n+" ");
            if(n%2==0){
               n/=2;
            }else{
                n=3*n+1;
            }
        }
        System.out.print(n);
    }
}
