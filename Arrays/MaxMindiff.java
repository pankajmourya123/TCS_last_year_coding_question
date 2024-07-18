// Your Java program aims to find the maximum difference between the smallest and largest numbers in an array of integers. Let's break down the code and provide a question based on its functionality:

// Question:
// Problem Statement:

// Write a Java program that computes the maximum difference between the smallest and largest integers in an array.

// Input:

// The size of the array.
// Elements of the array.
// Output:

// The maximum difference between the smallest and largest integers in the array.
// Example:
// Input:
// Enter the size of the array: 5
// Enter the elements of the array:
// 3 10 5 7 2
// Output:
// The maximum difference between the smallest and largest numbers is: 8

import java.util.Scanner;

public class MaxMindiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array to find the min and max values
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Calculate the maximum difference
        int maxDifference = max - min;
        
        // Print the result
        System.out.println("The maximum difference between the smallest and largest numbers is: " + maxDifference);
    }
}
