// Problem Statement: Product of Digits
// Create a Java program that calculates the product of digits of a given positive integer N.

// Steps:
// Input:

// Accept a positive integer N from the user.
// Validate that N is greater than 0.
// Process:

// Calculate the product of all digits of N.
// Initialize a variable product to 1.
// Iterate through each digit of N:
// Extract the last digit using modulus (%) operation.
// Multiply the current product by the extracted digit.
// Remove the last digit from N by integer division (/).
// Output:

// Print the calculated product of digits.
// Example:
// Input
// N = 12345
// Output
// Product of digits: 120

package Math;

import java.util.Scanner;

public class Productnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }

        System.out.println("Product of digits: " + product);
    }
}
