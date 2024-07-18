// Problem Statement: Union of Two Arrays

// You need to write a program that finds and returns the union of two sorted integer arrays.

// Input:

// The program initializes two integer arrays arr1 and arr2, which are already sorted in ascending order.
// Output:

// Return a list containing the union of elements from both arrays, also sorted in ascending order, without duplicate elements.
// Example:

// Input:
// arr1 = [1, 2, 3, 4, 5]
// arr2 = [3, 4, 5, 6, 7]
// Output:
// [1, 2, 3, 4, 5, 6, 7]
// Explanation:

// In the input arrays arr1 and arr2, the union of elements is [1, 2, 3, 4, 5, 6, 7].
// Therefore, the program computes and returns this union list in sorted order.

import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> union = findUnion(arr1, arr2); 
    }

    public static List<Integer> findUnion(int[] arr1,int [] arr2){
        List<Integer> union = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]) {
                union.add(arr1[i]);
                i++;
            }else if(arr1[i]>arr2[i]){
                union.add(arr2[j]);
                j++;
            }else{
                union.add(arr1[i]);
                i++;
                j++;

            }

            while (i<arr1.length) {
                union.add(arr1[i]);
                i++;
            }

            while (j<arr1.length) {
                union.add(arr1[j]);
                j++;
            }
        }
        return union;
    }
}
