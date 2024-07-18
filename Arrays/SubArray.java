// Problem Statement: Count Subarrays with Given Sum

// You need to write a program that counts the number of subarrays (contiguous subarrays) within an integer array arr that sum up to a given integer k.

// Input:

// The program initializes an integer array arr containing elements.
// It specifies an integer k, which is the target sum to find within the subarrays.
// Output:

// Print the count of subarrays whose elements sum up to k.
// Example:

// Input:
// arr = [1, 2, 3, 5, 6, 4]
// k = 6
// Output:
// 3

// Explanation:

// In the input array [1, 2, 3, 5, 6, 4], there are three subarrays that sum up to 6:
// Subarray [1, 2, 3] starting from index 0
// Subarray [2, 3, 1] starting from index 1
// Subarray [6] starting from index 4


public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4};
        int k = 6;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; 
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++; 
                }
            }
        }
        System.out.println(count);
    }
}
