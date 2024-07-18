// Problem Statement: Nearest Number Divisible by Y
// Create a Java program that finds the nearest number to X which is divisible by Y.

// Steps:
// Input:

// Accept two integer inputs, X and Y, from the user.
// Process:

// Calculate the nearest number to X that is divisible by Y.
// Use the formula:
// arduino
// Copy code
// nearest = Math.round(X / (double) Y) * Y;
// Math.round(X / (double) Y) calculates the quotient of X divided by Y and rounds it to the nearest integer.
// Multiply the rounded quotient by Y to get the nearest number that is divisible by Y.
// Output:

// Print the nearest number that is divisible by Y.
// Example:
// Input:
// X = 17
// Y = 5
// Process:
// Quotient = 17 / 5 = 3.4
// Rounded quotient = Math.round(3.4) = 3
// Nearest number = 3 * 5 = 15
// Nearest number divisible by 5 is: 15

package Math;

import java.util.Scanner;

public class Nearer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        int nearest=(int) Math.round(x/(double)y)*y;
        System.out.println("Nearest number divisible by " + y+ " is: " + nearest);

    }
}
