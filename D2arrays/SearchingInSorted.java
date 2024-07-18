// Problem Statement: Search Element in Sorted Matrix

// You need to write a program that searches for a target integer in a sorted 2D matrix (mat). The matrix is sorted in such a way that:

// Each row is sorted in ascending order from left to right.
// Each column is sorted in ascending order from top to bottom.
// Input:

// The program initializes a sorted 2D integer array (mat).
// It also initializes an integer tar, which represents the target element to be found in the matrix.
// Output:

// Return a string that indicates the position of the target element in the matrix in the format: "Found at (row, column)".
// If the target element is not found in the matrix, return "Element not found".
// Example:

// Given the following matrix and target element:

// Example 1:
// mat1 = {
//     {10, 20, 30, 40},
//     {15, 25, 35, 45},
//     {27, 29, 37, 48},
//     {32, 33, 39, 50}
// }
// target = 29
// The target element 29 is present in the matrix at position (3, 2) (1-based index). Therefore, the program should return "Found at (3, 2)"
package D2arrays;

public class SearchingInSorted {
    public static void main(String[] args) {
        int[][] mat1 = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int x1 = 29;
        System.out.println("Input 1:");
        printMatrix(mat1);
        System.out.println("Output 1: " + findPosition(mat1, x1));
  
    }

    public static void printMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

    public static String findPosition(int [][] mat,int tar){
        int n=mat.length;
        int row=0;
       int col=n-1;
       while (row<n && col>=0) {
        if(mat[row][col]==tar){
            return "Found at (" + (row + 1) + ", " + (col + 1) + ")";
        }else if(mat[row][col]>tar){
            col--;
        }else{
            row++;
        }
       }
 return "element not found";
    }
}
