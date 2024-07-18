// Problem Statement: Maximum Subarray Sum

// You are required to write a program that finds the maximum sum of any contiguous subarray within an array of integers.

// Input:

// The program initializes an integer array arr containing elements.
// Output:

// Print the maximum sum of any contiguous subarray.
// Example:

// Input:
// arr = [-2, 1, 3, 4, -1, 2, 1, -5, 4]
// Output:
// 7
// Explanation:

// In the input array [-2, 1, 3, 4, -1, 2, 1, -5, 4], the contiguous subarray [1, 3, 4, -1, 2, 1] has the maximum sum of 7.
// Note:

// The program uses a single pass through the array (currsum and Max variables) to efficiently compute the maximum sum of any contiguous subarray.
// It resets currsum to 0 whenever currsum becomes negative, effectively resetting the starting point for the next potential subarray.
// The approach ensures that the maximum sum of any contiguous subarray is found with a time complexity of O(n), where n is the length of the array.
import java.util.Scanner;

public class Submax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={-2,1,3,4,-1,2,1,-5,4};

        int currsum=0;
        int Max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum+=arr[i];
            if(currsum>Max){
                Max=currsum;
            }

            if(currsum<0){
                currsum=0;
            }
        }
    }
}
