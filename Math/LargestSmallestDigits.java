// Problem Statement: Largest and Smallest Digits in a Number
// Create a Java program to find the largest and smallest digits in a given integer N.

// Steps:
// Input:

// Accept an integer input N.
// Process:

// Implement two methods:
// findLargestDigit: Finds and returns the largest digit in N.
// findSmallestDigit: Finds and returns the smallest digit in N.
// Use a loop to iterate through each digit of N:
// Extract each digit using num % 10.
// Update the largest and smallest digit values accordingly using Math.max and Math.min.
// Reduce num by dividing it by 10 (num /= 10) to move to the next digit.
// Output:

// Print the largest and smallest digits found in N.

// Example:
// Input: N = 188
// Process:
// Largest digit: 8
// Smallest digit: 1
package Math;

public class LargestSmallestDigits {
 public static void main(String[] args) {
    int N = 188;
        
        int largestDigit = findLargestDigit(N);
        int smallestDigit = findSmallestDigit(N);
        
        System.out.println("Largest digit in " + N + ": " + largestDigit);
        System.out.println("Smallest digit in " + N + ": " + smallestDigit);
 }   

 public static int findLargestDigit(int num) {
    int largest = 0;
    
    while (num > 0) {
        int digit = num % 10;
        largest = Math.max(largest, digit);
        num /= 10;
    }
    
    return largest;
}
public static int findSmallestDigit(int num) {
    int smallest = 9; // Initialize with the largest possible digit
    
    while (num > 0) {
        int digit = num % 10;
        smallest = Math.min(smallest, digit);
        num /= 10;
    }
    
    return smallest;
}
}
