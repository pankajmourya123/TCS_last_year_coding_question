// Problem Statement: Ranking Array Elements

// You need to write a program that reads an integer array from the user, computes the rank of each element based on its value (where the smallest element gets rank 1, the second smallest gets rank 2, and so on), and prints an array where each element is replaced by its rank in the original array order.

// Input:

// The program prompts the user to enter an integer n followed by n integers representing the elements of the array.
// Output:

// Print an array where each element represents the rank of the corresponding element in the original array.
// Example:

// Input:

// Copy code
// 5 10 8 15 12 6
// Output:

// csharp
// Copy code
// [3, 2, 5, 4, 1]
// Explanation:

// The input array is [10, 8, 15, 12, 6].
// Sorting this array gives [6, 8, 10, 12, 15].
// Assigning ranks based on the sorted array gives [1, 2, 3, 4, 5].
// The output array corresponds to the ranks of elements in the original array order: [3, 2, 5, 4, 1].
// Note:

// The method main reads the input, sorts the array to determine ranks, and then creates a mapping of each element to its rank using a HashMap.
// The ranks are assigned based on the sorted order of elements and stored in an array res which is printed as the final output.



import java.util.*;


public class RankArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

    
        int n = Integer.parseInt(str[0]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i + 1]);
        }


         int [] sortedArr= Arrays.copyOf(arr, n);

         Arrays.sort(sortedArr);

        HashMap<Integer,Integer> hm=new HashMap<>();
int rank=1;
        for (int i : sortedArr) {
            hm.put(i, rank++);
        }

       int [] res=new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
          res[i]=hm.get(arr[i]);
       }
        
       System.out.println(Arrays.toString(res));
    }
}
