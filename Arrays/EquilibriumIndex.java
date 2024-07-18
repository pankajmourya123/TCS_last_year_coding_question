// The provided code is a Java program that finds the equilibrium index in an array. The equilibrium index is defined as an index where the sum of elements on the left is equal to the sum of elements on the right.

// ### Problem Description

// Write a program that:
// 1. Reads an array of integers.
// 2. Finds the equilibrium index in the array, where the sum of elements on the left of the index is equal to the sum of elements on the right.

// **Approach:**
// 1. Calculate the total sum of the array elements.
// 2. Iterate through the array, adjusting the total sum to represent the right sum and maintaining a left sum.
// 3. For each index, check if the left sum equals the right sum.
// 4. Print the equilibrium index if found, otherwise print that no equilibrium index was found.

// **Example:**

// **Input:**
// ```
// int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
// ```

// **Output:**
// ```
// Equilibrium index is 3
// ```

// **Explanation:**
// - For index 3 (value `2`):
//   - The sum of elements on the left: `-7 + 1 + 5 = -1`
//   - The sum of elements on the right: `-4 + 3 + 0 = -1`
// - Since both sums are equal, index 3 is the equilibrium index.







public class EquilibriumIndex {
    public static void main(String[] args) {
        int totalSum = 0;
        int leftSum = 0;
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };

        // Calculate the total sum of the array elements
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Iterate through the array and find the equilibrium index
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // totalSum is now rightSum for index i

            if (leftSum == totalSum) {
                System.out.println("Equilibrium index is " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No equilibrium index found");
    }
}
