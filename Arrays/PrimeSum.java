
// Certainly! Here's the problem statement for the provided Java program and an example output:

// Problem Statement: Prime Numbers with Prime Sum of Digits

// You are required to write a program that finds and prints all prime numbers within a specified range [n, m] such that the sum of their digits is also a prime number.

// Input:

// The program prompts the user to enter two integers, n and m, representing the start and end of the range respectively.
// Output:

// Print each prime number i within the range [n, m] for which both i itself is a prime number and the sum of its digits is also a prime number.
// Example:

// Input:

// mathematica
// Copy code
// Enter start:
// 10
// Enter End:
// 50
// Output:

// Copy code
// 11
// 23
// Explanation:

// For the input range [10, 50]:
// 11 is a prime number and the sum of its digits 1 + 1 = 2 is also a prime number.
// 23 is a prime number and the sum of its digits 2 + 3 = 5 is also a prime number.
// Other numbers in the range, like 13, 17, 19, 29, 31, 37, 41, 43, and 47, do not satisfy both conditions (either their own prime status or the prime status of their digit sums).
// Note:

// The method findPrimeNumbers takes two integers n and m as input and prints each prime number within the range [n, m] for which both the number itself and the sum of its digits are prime.
// The method isPrime checks if a given number is prime.
// The method sumOfdigits computes the sum of digits of a given number



import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter start");
        int n=sc.nextInt();
        
        System.out.println("Enter End");
        int m=sc.nextInt();
        
        findPrimeNumbers(n, m);
    }

    public static void findPrimeNumbers(int n,int m){
for (int i = n; i <=m; i++) {
    if(isPrime(i)&& isPrime(sumOfdigits(i))){
        System.out.println(i);
    }
    
}
    }

    public static boolean isPrime(int num){
       for (int i = 2; i *i<=num; i++) {
        if(num%i==0){
            return false;
        }
       }
       return true;
    }

    public static int sumOfdigits(int n){
        int sum=0;
        while (n!=0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
