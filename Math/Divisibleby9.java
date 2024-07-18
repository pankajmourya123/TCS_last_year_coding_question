// Explanation:
// Input Handling: The program starts by taking a three-digit number as input from the user.
// Validation: It checks if the input number is a three-digit number (i.e., between 100 and 999 inclusive).
// Divisibility Check:
// If the number is a three-digit number, it checks whether the number is divisible by 9.
// If the number is divisible by 9, it prints a message indicating that the number is divisible by 9.
// If the number is not divisible by 9, it prints a message indicating that the number is not divisible by 9.
// Invalid Input Handling: If the input number is not a three-digit number, it prints a message indicating that the entered number is not a three-digit number.

package Math;

import java.util.*;

public class Divisibleby9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number");
int num=sc.nextInt();
        if(num>=99 && num<=999){
            if (num % 9 == 0) {
                System.out.println("The number " + num + " is divisible by 9.");
            } else {
                System.out.println("The number " + num + " is not divisible by 9.");
            } 
        }
    else{
        System.out.println("The entered number is not a three-digit number.");
    }
}
}