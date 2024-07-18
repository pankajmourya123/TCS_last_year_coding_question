// The provided code is a Java program that calculates the bitwise OR for all possible subarrays of a given array of integers. The program then sorts the results and prints them.

// ### Problem Description

// Write a program that:
// 1. Reads a line of space-separated integers from the user input, which form the array elements.
// 2. Generates all possible subarrays of the given array.
// 3. Computes the bitwise OR for each subarray.
// 4. Sorts and prints the bitwise OR results of all subarrays.

// **Input Format:**
// - A single line of space-separated integers representing the elements of the array.

// **Output Format:**
// - The sorted bitwise OR results of all subarrays, printed on a single line separated by spaces.

// **Example:**

// **Input:**
// ```
// 1 2 3
// ```

// **Output:**
// ```
// 1 2 3 3 3 3 
// ```

// In this example, the input `1 2 3` results in the following subarrays:
// - `[1]`
// - `[1, 2]`
// - `[1, 2, 3]`
// - `[2]`
// - `[2, 3]`
// - `[3]`

// The bitwise OR for each subarray is computed, and the results are sorted and printed:
// - `1` (from `[1]`)
// - `3` (from `[1, 2]`)
// - `3` (from `[1, 2, 3]`)
// - `2` (from `[2]`)
// - `3` (from `[2, 3]`)
// - `3` (from `[3]`)

// The final sorted output is `1 2 3 3 3 3`.




import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BitwiseOrofSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] inputarr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> subarrays = new ArrayList<>();

        // Generate all subarrays
        for (int i = 0; i < inputarr.length; i++) {
            for (int j = i; j < inputarr.length; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(inputarr[k]);
                }
                subarrays.add(subarray);
            }
        }

        // Calculate bitwise OR for each subarray and store results
        List<Integer> bitwiseORResults = new ArrayList<>();
        for (List<Integer> subarray : subarrays) {
            int bitwiseOR = 0;
            for (int num : subarray) {
                bitwiseOR |= num; // Perform bitwise OR
            }
            bitwiseORResults.add(bitwiseOR);
        }
Collections.sort(bitwiseORResults);
        // Print or use bitwiseORResults as needed
        System.out.println("Bitwise OR results of all subarrays:");
        for (int result : bitwiseORResults) {
            System.out.print(result + " ");
        }
    }
}
