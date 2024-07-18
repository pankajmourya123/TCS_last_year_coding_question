// Problem Statement: Modify Array Elements Based on Divisibility

// You are required to write a program that modifies elements of an integer array based on specific divisibility rules. The program should read an array of integers from the user, modify each element according to the following rules, and then output the modified array:

// If an element is divisible by both 3 and 5, replace it with the string "ThreeFive".
// If an element is divisible only by 3, replace it with the string "Three".
// If an element is divisible only by 5, replace it with the string "Five".
// If an element is not divisible by either 3 or 5, leave it unchanged (represented as its original integer value).
// Input Format:

// The program should first prompt the user to enter the size of the array N.
// Next, it should prompt the user to enter N integers, one per line.
// Output Format:

// Print the modified array where each element is either an integer or one of the strings "Three", "Five", or "ThreeFive".
// Example:

// Input:
// Enter the size of array (N): 5
// Enter the elements of the array:
// 15
// 7
// 10
// 6
// 30

// Output:
// Modified array:
// ThreeFive 7 Five Three Five


import java.util.Scanner;

public class ModifyArrayElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array (N): ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        String[] modifiedArray = modifyArray(arr);
        
        System.out.println("Modified array:");
        for (String num : modifiedArray) {
            System.out.print(num + " ");
        }
    }

    public static String[] modifyArray(int[] arr) {
        String[] modifiedArray = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                modifiedArray[i] = "ThreeFive";
            } else if (arr[i] % 3 == 0) {
                modifiedArray[i] = "Three";
            } else if (arr[i] % 5 == 0) {
                modifiedArray[i] = "Five";
            } else {
                modifiedArray[i] = String.valueOf(arr[i]);
            }
        }
        
        return modifiedArray;
    }
}
