// Problem Statement: Sort an Array of 0s, 1s, and 2s

// You are required to write a program that sorts an array containing only 0s, 1s, and 2s in ascending order.

// Input:

// The program prompts the user to enter the number of elements in the array and then the elements themselves.
// Output:

// Print the sorted array containing 0s, 1s, and 2s in ascending order.
// Example:

// Input:
// Enter element of array
// 6
// 2 1 0 1 2 0
// Output:
// [0, 0, 1, 1, 2, 2]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sorting012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter element of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        bruteforce(arr);
    }

    public static void bruteforce(int [] arr){
          HashMap<Integer,Integer> hm=new HashMap<>();

          for (int i : arr) {
            hm.put(i,hm.getOrDefault(i, 0)+1);
          }

      int idx=0;
      for (int i = 0; i<=2; i++) {
        if(hm.containsKey(i)){
        int count=hm.get(i);
        for (int j = 0; j < count; j++) {
            arr[idx++]=i;
        }

      }
    }
    System.out.println(Arrays.toString(arr));
}

public void sortArray(int [] arr){
    int l=0;
    int mid=0;
    int r=arr.length-1;
    while (mid<=l) {
        if(arr[mid]==0){
       swap(arr, mid, l);
        }else if(arr[mid]==1){
            mid++;
        }else{
            swap(arr, mid, r);
                r--;
        }
    }
}
private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
}