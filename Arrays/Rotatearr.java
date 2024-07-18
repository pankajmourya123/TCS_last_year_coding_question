// Problem Statement: Rotate Array

// You are required to write a program that rotates an integer array to the right by k positions.

// Input:

// The program initializes an integer array arr and an integer k representing the number of positions to rotate the array.
// Output:

// Print the array arr after it has been rotated by k positions to the right.
// Example:

// Input:
// arr = [1, 2, 3, 4, 5]
// k = 3
// Output:
// Original Array:
// 1 2 3 4 5 
// Array after rotation:
// 3 4 5 1 2 

public class Rotatearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println("Original Array:");
        printArray(arr);

        rotatearr(arr, k);

        System.out.println("Array after rotation:");
        printArray(arr);
    }

    public static void rotatearr(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse elements in the array from index start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to print the elements of the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
