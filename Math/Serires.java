// Problem Statement: Series Term Calculation
// Write a Java program to compute the Nth term of a series based on the following rules:

// If the position N of the term is odd, compute the term as a power of 2 multiplied by the previous odd term.
// If the position N of the term is even, compute the term as a power of 3 multiplied by the previous even term.
// Steps:
// Input:
// Prompt the user to enter an integer N.
// Process:
// Initialize two variables a and b to 1, representing the initial terms.
// Iterate through numbers from 1 to N:
// If i is odd (i % 2 != 0), update a by multiplying it by 2.
// If i is even (i % 2 == 0), update b by multiplying it by 3.
// Output:
// If N is odd, print the Nth term at odd position (a).
// If N is even, print the Nth term at even position (b).

// Example:
// Input
// N = 5
// Process:
// Iterate through numbers 1 to 5.
// Update a and b based on the rules provided.
// Output
// Nth term at odd position is: 8

package Math;

import java.util.Scanner;

public class Serires {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of N to find Nth term: ");
        int n = sc.nextInt();

        int a=1,b=1;

        for (int i = 1; i <=n; i++) {
           if(i%2!=0){
            a*=2;
           }else{
            b*=3;
           } 
        }

        if (n % 2 != 0) {
            System.out.println("Nth term at odd position is: " + a);
        } else {
            System.out.println("Nth term at even position is: " + b);
        }
    }
}
