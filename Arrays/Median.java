// Your current implementation of finding the median in an array has a logical flaw in the else branch of findMedian method where you calculate the median for arrays with even length. Let's correct that and also provide a question based on the functionality:

// Question:
// Problem Statement:

// Write a Java program to find the median of an integer array.

// Input:

// Two integer arrays (arr1 and arr2).
// Output:

// The median of each array.
// Example:

// Input:
// arr1 = {2, 4, 1, 35}
// arr2 = {1, 2, 3, 4, 5, 6}
// Output:
// Median of arr1: 3.0
// Median of arr2: 3.5

public class Median {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 35};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        double median1 = findMedian(arr1);
        double median2 = findMedian(arr2);
    }

    public static double findMedian(int[] arr) {
        int n=arr.length;
        if(n%2==1){
            return arr[n/2];
        }else{
            int ind1=n/2-1;
            int ind2=n/2;
            return(ind1+ind2)/2;
        }
    }
}
