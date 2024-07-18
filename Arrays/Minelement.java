// Problem Statement: Minimum Absolute Difference Calculation

// You are given two integers, b and l, and an array x of integers. Your task is to find two distinct elements x[i] and x[j] from the array such that the absolute difference between bx[i] + yx[j] and l is minimized. Additionally, determine how many pairs of such elements achieve this minimum absolute difference.

// Write a program that reads the values of b, l, and the array x, and outputs two values:

// The minimum absolute difference between bx[i] + yx[j] and l.
// The number of pairs (x[i], x[j]) that achieve this minimum absolute difference.
// Input Format:

// The first line contains two integers b and l, separated by a space.
// The second line contains integers separated by spaces representing the elements of the array x.
// Output Format:

// Print two integers:
// The minimum absolute difference.
// The number of pairs (x[i], x[j]) that achieve this minimum absolute difference.
// Constraints:

// 1 <= b, l <= 1000
// 2 <= |x| <= 100
// -1000 <= x[i] <= 1000
// Example:

// Input:

// Copy code
// 2 10
// 1 4 6 8
// Output:

// Copy code
// 0 3
// Explanation:
// In the given example:

// b = 2 and l = 10
// The array x = [1, 4, 6, 8]
// The calculations for each pair (x[i], x[j]) are:

// (1, 4): |2*1 + 2*4 - 10| = |10 - 10| = 0
// (1, 6): |2*1 + 2*6 - 10| = |14 - 10| = 4
// (1, 8): |2*1 + 2*8 - 10| = |18 - 10| = 8
// (4, 6): |2*4 + 2*6 - 10| = |20 - 10| = 10
// (4, 8): |2*4 + 2*8 - 10| = |24 - 10| = 14
// (6, 8): |2*6 + 2*8 - 10| = |28 - 10| = 18
// The minimum absolute difference is 0, and there are 3 pairs (1, 4), (1, 6), and (4, 6) that achieve this minimum difference.

import java.util.*;

public class Minelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading m and l
        String[] input1 = sc.nextLine().split(" ");
        int m = Integer.valueOf(input1[0]);
        int l = Integer.valueOf(input1[1]);

        // Reading array elements
        String[] inputStrings = sc.nextLine().split(" ");
        int[] arr = new int[inputStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(inputStrings[i]);
        }

        int min = Integer.MAX_VALUE;
        int count = 0;

        // Finding the minimum absolute difference
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                min = Math.min(min, Math.abs(arr[i] + arr[j] - l));
            }
        }

        // Counting pairs with the minimum absolute difference
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] + arr[j] - l) == min) {
                    count++;
                }
            }
        }

        System.out.println(min + " " + count);
    }
}
