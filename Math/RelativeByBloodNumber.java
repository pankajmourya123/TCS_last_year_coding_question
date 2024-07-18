// Problem Statement: Relative by Blood Number
// Write a Java program to determine if a given integer N is a "Relative by Blood" number.

// Definition:
// A "Relative by Blood" number is defined as a number for which the sum of the factorials of its digits equals the original number itself.

// Steps:
// Input:

// Consider a positive integer N.
// Process:

// Calculate the sum of factorials of all digits of N.
// Compare this sum with the original number N.
// If they are equal, N is a "Relative by Blood" number.
// Use the factorial function to compute the factorial of a digit.
// Output:

// Print 1 if N is a "Relative by Blood" number.
// Print 0 if N is not a "Relative by Blood" number.
// Example:
// Input
// N = 145
// Output
// 1

package Math;

public class RelativeByBloodNumber {
    public static void main(String[] args) {
        int N = 145;
        
        // Check if N is a Relative by blood number
        if (isRelativeByBlood(N)) {
            System.out.println("1");
        } else {
            System.out.println("e");
        }
    }
    
    public static boolean isRelativeByBlood(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;
        
        // Calculate sum of factorials of digits
        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        
        // Check if sum of factorials equals the original number
        return sumOfFactorials == originalNum;
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
