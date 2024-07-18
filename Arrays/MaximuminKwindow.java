
// Question:
// Problem Statement:

// Given an array of integers and a sliding window size k, write a Java program to find the maximum value in each sliding window of size k across the array.

// Input:

// A single line of space-separated integers representing the array.
// An integer k representing the size of the sliding window.
// Output:

// An array of integers where each element represents the maximum value in the corresponding sliding window of size k.
// Example:
// Input:
// 1 3 -1 -3 5 3 6 7
// 3
// Output:
// [3, 3, 5, 5, 6, 7]

// Explanation:
// Given the array [1, 3, -1, -3, 5, 3, 6, 7] and k = 3, the sliding windows and their maximum values are:

// [1, 3, -1] -> Maximum is 3
// [3, -1, -3] -> Maximum is 3
// [-1, -3, 5] -> Maximum is 5
// [-3, 5, 3] -> Maximum is 5
// [5, 3, 6] -> Maximum is 6
// [3, 6, 7] -> Maximum is 7
// Thus, the output is [3, 3, 5, 5, 6, 7].

import java.util.Arrays;
import java.util.Scanner;

public class MaximuminKwindow {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String [] str=sc.nextLine().split(" ");
int [] arr=Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
int k = sc.nextInt();
int[] result=maxSlidingWindom(arr,k);
System.out.println(Arrays.toString(result));

    }

    public static int[] maxSlidingWindom(int[] arr,int k ){
        if (arr == null || arr.length < k) return new int[0];
        
        int n=arr.length;
        int [] res=new int[n-k+1];
        for (int i = 0; i <n-k+1; i++) {
            int max = Integer.MIN_VALUE;
           for (int j = i; j < i+k; j++) {
            max=Math.max(max, arr[j]);
           } 
           res[i]=max
;        }

return res;
    }
}
