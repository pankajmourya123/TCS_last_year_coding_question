// Find Maximum Efficiency of Three Employees
// Problem Statement:
// Given an array of integers representing the efficiency of employees, find the maximum product of the efficiency of any three employees.

// Example
// Input:
// 5
// 1 10 2 6 5

// Output:
// 300

// Explanation
// Input Handling:

// Read the number of employees n and their efficiency values from the input.
// Sorting:

// Sort the array of efficiencies in ascending order using Arrays.sort(effi).
// Calculating Maximum Product:

// If there are at least 3 employees (n >= 3), calculate two possible products:
// The product of the three largest numbers (effi[n-1] * effi[n-2] * effi[n-3]).
// The product of the two smallest numbers and the largest number (effi[0] * effi[1] * effi[n-1]).
// The maximum product will be the maximum of these two products.
// Output:

// Print the maximum product of the efficiency of any three employees.

import java.util.Arrays;
import java.util.Scanner;

public class MaximumEff3Emp {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();


      int [] effi=new int[n];
      for (int i = 0; i < n; i++) {
        effi[i] = sc.nextInt();
    }
    Arrays.sort(effi);
    int max=Integer.MIN_VALUE;

    if(n>=3){
        int product=effi[n-1]*effi[n-2]*effi[n-3];
        max=Math.min(max, product);
    }
    if(n>=3){
        int product=effi[0]+effi[1]*effi[n-1];
        max=Math.min(max, product);
    } 
    
    System.out.println(max);


    }
}
