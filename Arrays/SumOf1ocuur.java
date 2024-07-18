// Problem Statement: Sum of Elements Occurring Once

// You need to write a program that calculates the sum of all elements in an integer array that occur exactly once.

// Input:

// The program prompts the user to enter the number of elements in the array followed by the elements themselves.
// Output:

// Print the sum of all elements that occur exactly once in the array.
// Example:

// Input:
// 5
// 1 2 3 2 4
// Output:
// 8

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOf1ocuur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : arr) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
int sum=0;
        for (Map.Entry<Integer,Integer> Entry: hm.entrySet()) {
            int v=Entry.getValue();
            if(v==1){
sum+=Entry.getKey();
            }

        }
        System.out.println(sum);
    }
}
