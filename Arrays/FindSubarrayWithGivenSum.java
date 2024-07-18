// The provided code is a Java program that finds a subarray with a given sum in an array of integers. The program reads the number of elements in the array, the elements of the array, and the target sum from the user, then identifies and prints the indices of the subarray that sums to the target value, if such a subarray exists.

// Problem Description
// Write a program that:

// Reads the number of elements in the array.
// Reads the elements of the array.
// Reads the target sum.
// Finds and prints the indices of the subarray that sums to the target value.
// If no such subarray is found, it prints a message indicating that.
// Approach:

// Use a sliding window technique to maintain a current sum of the subarray.
// If the current sum exceeds the target sum, adjust the start index of the window.
// If the current sum equals the target sum, print the start and end indices of the subarray and stop.
// If no subarray with the given sum is found, print a message indicating that.
// Example:

// Input:

// mathematica
// Copy code
// Enter the number of elements in the array:
// 5
// Enter the elements of the array:
// 1 2 3 7 5
// Enter the target sum:
// 12
// Output:

// css
// Copy code
// Subarray found from index 1 to 3
// Explanation:

// The subarray with the given sum 12 is [2, 3, 7], which corresponds to indices 1 to 3.


import java.util.*;
class FindSubarrayWithGivenSum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
  System.out.println("Enter the target sum:");
  int target=sc.nextInt();
  findSubarrayWithGivenSum(arr,target);


    }
public static void findSubarrayWithGivenSum(int [] arr,int k){
    int n=arr.length;
    int currsum=0;
    int s=0;
    boolean found=false;
     
    for(int i=0;i<n;i++){
         currsum+=arr[i];

         if(currsum>k && s<=i){
            currsum-=arr[s];
            s++;
         }

         if(currsum==k){
            System.out.println("Subarray found from index " + s + " to " + i);
            found = true;
            break;
         }

         if (!found) {
            System.out.println("No subarray found with the given sum.");
        }
    }

}


}