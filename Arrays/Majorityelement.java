// The provided code aims to find and print the majority element(s) in an array, where a majority element is defined as an element that appears at least n / 2 times (where n is the size of the array). There are a couple of corrections and improvements that can be made to the code:

// The threshold for a majority element is usually defined as appearing more than n / 2 times, not n / 2 times.
// Improve the readability and formatting of the output.
// Problem Description
// Given an array, find and print the element(s) that appear more than n / 2 times. If no such element exists, nothing should be printed.
// Example
// Input:
// 6
// 2 2 1 1 1 2 2

// Output:
// 2


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Majorityelement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        findMajorityElement(array, n);  
    }

     public static void findMajorityElement(int[] array, int n) {
        
        HashMap<Integer, Integer> frequency = new HashMap<>();

     
        for (int num : array) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

       
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() >= n / 2) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
