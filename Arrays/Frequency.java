// The provided code aims to sort the array elements by their frequency and then create a new list where elements appear according to their frequency. However, the logic for reconstructing the list based on frequencies needs to be corrected.

// Corrected Code
// Here is the corrected version of the code:

// Create a HashMap to count the frequencies of each element in the array.
// Create a list from the entries of the HashMap.
// Sort this list by frequency.
// Construct the result list based on the sorted frequency list

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 3, 3, 3, 3};
        
        // Step 1: Create a HashMap to store the frequency of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the elements of the HashMap and sort by frequency
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 3: Create the result list based on the sorted frequency list
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                res.add(entry.getKey());
            }
        }

        System.out.println(res);
    }
}
