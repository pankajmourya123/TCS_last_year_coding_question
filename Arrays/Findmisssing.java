
// The provided code is a Java program that finds the missing number in an array of n-1 elements where the elements are from 1 to n with exactly one missing number.






public class Findmisssing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Example array
        int n = 5; // Example value of n
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of first n natural numbers
        int totalSum = n * (n + 1) / 2;
        
        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // The missing number is the difference between the total sum and the array sum
        return totalSum - arraySum;
    }
}
