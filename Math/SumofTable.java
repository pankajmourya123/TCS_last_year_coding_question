// Problem Statement: Sum of Multiplication Table
// Write a Java program to compute the sum of the multiplication table of a given integer n from 1 to 10.

// Steps:
// Input:
// Prompt the user to enter an integer n.
// Process:
// Initialize a variable sum to 0 to store the cumulative sum of all products.
// Use a loop to iterate through numbers from 1 to 10.
// Inside the loop, compute the product of i and n (table = i * n).
// Add table to sum to update the cumulative sum.
// Output:
// Print the final value of sum, which represents the sum of all products from the multiplication table of n from 1 to 10.
// Example:
// Input
// n = 5
// Process:
// Compute the multiplication table for n = 5:
// 1 * 5 = 5
// 2 * 5 = 10
// 3 * 5 = 15
// ...
// 10 * 5 = 50
// Calculate the sum of these products.
// 275

package Math;

import java.util.Scanner;

public class SumofTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int sum=0;
        for(int i=1;i<=10;i++){
            int table=i*n;
            sum+=table;
        }
        System.out.println(sum);
    }
}
