// Problem Statement: Armstrong Number Checker
// Write a Java program that checks whether a given integer is an Armstrong number or not. An Armstrong number (also known as a narcissistic number or plenary number) for a given number of digits 
// 𝑘
// k is an integer that is equal to the sum of its own digits each raised to the power 
// 𝑘
// k.


package Math;

import java.util.Scanner;

public class ArmstromNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
      
      int n=sc.nextInt();
      isArmstrongNumber(n);
    }

    public static boolean isArmstrongNumber(int n){
        int org=n;
        int numOfDigit=String.valueOf(n).length();
        int sum=0;

        while (n>0) {
            int digit=n%10;
            sum+=Math.pow(digit, numOfDigit);
            n/=10;
        }

        return sum==org;
    }
}
