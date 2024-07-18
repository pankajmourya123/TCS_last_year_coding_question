// Problem Statement: Good or Bad Number Checker
// Create a Java program to determine whether a given number is a "Good Number" or a "Bad Number". A "Good Number" is defined as a number that is divisible by the sum of its digits.

// Steps:
// Input:

// Accept an integer input num.
// Process:

// Calculate the sum of digits of num using a helper method calculateSumOfDigits.
// Check if num is divisible by the sum of its digits:
// If num % sumOfDigits == 0, then num is classified as a "Good Number".
// Otherwise, classify it as a "Bad Number".
// Output:

// Print "Good Number" if the number satisfies the condition.
// Print "Bad Number" otherwise


package Math;

public class GoodNumber {
   public static void main(String[] args) {
    int num1 = 3;
    int num2 = 27;
    
    String result1 = findGoodOrBadNumber(num1); // Example 1
    String result2 = findGoodOrBadNumber(num2); // Example 2
    
    System.out.println("Example 1: " + result1);
    System.out.println("Example 2: " + result2);
   } 

  
   public static String findGoodOrBadNumber(int num) {
    int sumOfDigits = calculateSumOfDigits(num);
    
    if (num % sumOfDigits == 0) {
        return "Good Number";
    } else {
        return "Bad Number";
    }
}

public static int calculateSumOfDigits(int num) {
    int sum = 0;
    
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    
    return sum;
} 
}
