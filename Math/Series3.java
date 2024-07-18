// Problem Statement: Generated Mixed Series
// Write a Java program to generate a mixed series up to a given integer n using the following rules:

// If the number i is prime, set s[i] = 2^i.
// If the number i is a perfect square, set s[i] = 3^i.
// For any other number i, set s[i] = s[i-1] + s[i-2].
// Steps:
// Input:

// Consider a positive integer n.
// Process:

// Initialize an array s of size n+1.
// Initialize s[1] = 1 and s[2] = 1.
// Iterate through numbers from 3 to n:
// Use helper methods isPrime(i) to check if i is prime.
// Use isPerfect(i) to check if i is a perfect square.
// Based on the conditions:
// Set s[i] = 2^i if i is prime.
// Set s[i] = 3^i if i is a perfect square.
// Otherwise, compute s[i] using the Fibonacci-like relation: s[i] = s[i-1] + s[i-2].
// Output:

// Print s[n], which represents the value of the mixed series at position n

package Math;

public class Series3 {
    public static void main(String[] args) {
       int n=15;
       System.out.println(genertedMixedSeries(n)); 
    }

    public static int genertedMixedSeries(int n){
        int [] s=new int[n+1];
        s[1]=1;
        s[2]=1;

        for (int i = 3; i <=n; i++) {
            if(isPrime(i)){
                s[i]=(int)Math.pow(2, i);
            }else if(isPrefect(i)){
                s[i]=(int)Math.pow(3, i);
            }else{
                s[i]=s[i-1]+s[i-2];
            }
        }
        return s[n];
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        

        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPrefect(int n){
        int sqrt =(int) Math.sqrt(n);
        return sqrt==n;
    }
}
