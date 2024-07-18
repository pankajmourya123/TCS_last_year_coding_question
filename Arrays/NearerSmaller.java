// Problem Statement: Nearest Smaller Elements

// You need to write a program that finds the nearest smaller element for each element in an integer array. For each element arr[i] in the input array arr, find the nearest element to the left of arr[i] that is smaller than arr[i]. If no such element exists, the output should be -1 for that position.

// Input:

// The program initializes an integer array, input1.
// Output:

// Print the array output1, where each element at index i contains the nearest smaller element to the left of input1[i]. If no smaller element exists to the left, the value should be -1.
// Example:

// Input:

// java
// Copy code
// int[] input1 = {1, 6, 4, 10, 2, 5};
// int[] output1 = findNearestSmallerElements(input1);
// Output:

// css
// Copy code
// Input 1: {1, 6, 4, 10, 2, 5}
// Output 1: -1 1 1 4 1 2 
// Explanation:

// For the input array {1, 6, 4, 10, 2, 5}:
// output1[0] is -1 because there are no smaller elements to the left of 1.
// output1[1] is 1 because 1 is the nearest smaller element to the left of 6.
// output1[2] is 1 because 1 is the nearest smaller element to the left of 4.
// output1[3] is 4 because 4 is the nearest smaller element to the left of 10.
// output1[4] is 1 because 1 is the nearest smaller element to the left of 2.
// output1[5] is 2 because 2 is the nearest smaller element to the left of 5.
// Note:

// The method findNearestSmallerElements takes an integer array arr as input and returns an array where each element represents the nearest smaller element to the left of the corresponding element in arr.





import java.util.ArrayList;
import java.util.Stack;

public class NearerSmaller {
    public static void main(String[] args) {
        int[] input1 = {1, 6, 4, 10, 2, 5};
        int[] output1 = findNearestSmallerElements(input1);
       
        System.out.print("Input 1: {1, 6, 4, 10, 2, 5}\nOutput 1: ");
        for (int value : output1) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }

    public static int[] findNearestSmallerElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Pop elements from stack while stack is not empty and top of stack is not smaller than current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            // If stack is empty, no smaller element to the left
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element to stack
            stack.push(arr[i]);
        }

        return result;
    }

    
    }

