
// Certainly! Here's the problem statement for the provided Java program and an example output:

// Problem Statement: Move Zeros to the End

// You need to implement a program that moves all the zeros in an integer array to the end, while maintaining the relative order of the non-zero elements. The modified array should be printed after the operation is performed.

// Input:

// The program initializes an array of integers, arr.
// Output:

// Print the modified array where all zeros are moved to the end, while non-zero elements retain their original order.
// Example:

// Input:
// int[] arr = {0, 0, 0, 1, 1, 1};
// MovesZeros(arr);
// Output:
// [1, 1, 1, 0, 0, 0]

import java.util.Arrays;

public class MovesZeros {
    public static void main(String[] args) {
        int [] arr={0,0,0,1,1,1};
        MovesZeros(arr);
    }

    public static void MovesZeros(int[] nums) {
        
        int j=0;
        
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[j++]=nums[i];
           }
       }
        while(j<nums.length){
            nums[j++]=0;
    }

    System.out.println(Arrays.toString(nums));
}
}