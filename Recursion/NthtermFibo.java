// Problem Statement:
// Write a Java program to compute different forms of Fibonacci numbers and sequences up to the Nth term based on user input.


package Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * NthtermFibo
 */
public class NthtermFibo {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=fibo(n);
System.out.println(sum);
int nth=fibonacciNthTerm(n);
System.out.println(nth);
System.out.println(fibonaccinthTerm(n));
System.out.println(fibonaccsuminthTerm(n));
     }
     public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
     }


  private static Map<Integer, Integer> memo = new HashMap<>();
     public static int fibonacciNthTerm(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Check if the value is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Recursively compute the value
        int result = fibonacciNthTerm(n - 1) + fibonacciNthTerm(n - 2);

        // Memoize the computed value
        memo.put(n, result);

        return result;
    }

    public static int fibonaccinthTerm(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int p2 = 0, p1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = p1 + p2;
            p2 = p1;
            p1 = current;
        }

        return current;
    }

    public static int fibonaccsuminthTerm(int n){
            if(n<=1){
                return n;
            }
            int a=0,b=1;
            int fibosum=1;

            for (int i = 2; i <n; i++) {
                int curr=a+b;
                fibosum+=curr;
                a=b;
                b=curr;
            }
            return fibosum;
    }
}