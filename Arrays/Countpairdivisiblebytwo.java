// The provided code is a Java program that counts the number of pairs of elements in an array that are divisible by 2. The program uses a HashMap to count occurrences of remainders when the array elements are divided by 2, and then calculates the number of valid pairs.

// ### Problem Description

// Write a program that:
// 1. Takes an array of integers as input.
// 2. Counts the number of pairs in the array where the sum of the pair is divisible by 2.

// **Approach:**
// - Count occurrences of remainders when the array elements are divided by 2.
// - Use the counts of these remainders to determine the number of valid pairs.

// **Steps:**
// 1. Calculate the remainder of each element when divided by 2.
// 2. Store the counts of these remainders in a HashMap.
// 3. Calculate the number of pairs for elements with remainder 0 (even numbers).
// 4. Calculate the number of pairs for elements with remainder 1 (odd numbers).
// 5. Sum the results to get the total number of pairs whose sum is divisible by 2.

// **Example:**

// **Input:**
// ```
// [1, 7, 4, 3, 6, 8]
// ```

// **Output:**
// ```
// Remainder counts: {0=3, 1=3}
// Number of pairs divisible by 2: 3
// ```

// In this example:
// - The array elements divided by 2 have remainders `{0, 1, 0, 1, 0, 0}`.
// - The count of elements with remainder 0 is 3, and with remainder 1 is 3.
// - The number of pairs with sum divisible by 2 is calculated as follows:
//   - Pairs with remainder 0: \(\frac{3 \times (3-1)}{2} = 3\)
//   - Pairs with remainder 1: \(\frac{3 \times (3-1)}{2} = 3\)
// - The total number of pairs is 3.




import java.util.HashMap;
import java.util.Map;

public class Countpairdivisiblebytwo {
   public static void main(String[] args) {
       int[] arr = {1, 7, 4, 3, 6, 8};
       Map<Integer, Integer> map = new HashMap<>();
       int count = 0;

       // Count occurrences of remainders when divided by 2
       for (int num : arr) {
           int remainder = num % 2;
           map.put(remainder, map.getOrDefault(remainder, 0) + 1);
       }

       System.out.println("Remainder counts: " + map);

       // Count pairs with remainder 0
       int zeroRemainderCount = map.getOrDefault(0, 0);
       count += (zeroRemainderCount * (zeroRemainderCount - 1)) / 2;

       // Count pairs with remainder 1
       int oneRemainderCount = map.getOrDefault(1, 0);
       count += (oneRemainderCount * (oneRemainderCount - 1)) / 2;

       System.out.println("Number of pairs divisible by 2: " + count);
   }
}
