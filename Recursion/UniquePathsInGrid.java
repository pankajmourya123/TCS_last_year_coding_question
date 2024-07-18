// Problem Statement:
// Write a Java program to calculate the number of unique paths from the top-left corner to the bottom-right corner of an m x n grid. You can only move either down or right at any point in time.

package Recursion;


import java.util.*;
class UniquePathsInGrid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows in the grid:");
        int m=sc.nextInt();

        System.out.println("Enter the number of columns in the grid:");
        int n = sc.nextInt();

        int uniquePaths=findUniquePaths(m,n);
        System.out.println(uniquePaths);
    }

    public static int findUniquePaths(int m,int n){
        if(m==1 || n==1){
            return 1;
        }

        int down=findUniquePaths(m-1, n);

        int right=findUniquePaths(m, n-1);
return down+right;

    }
}