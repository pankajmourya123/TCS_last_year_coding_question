// Problem Statement: Find Row with Maximum 'I's in Grid

// You need to write a program that determines which row in a 2D grid contains the maximum number of occurrences of the character 'I'.

// Input:

// The program initializes a 2D character array (grid) where each cell can either be 'I' (indicating presence) or 'e' (indicating absence).
// Output:

// Return the index (0-based) of the row that contains the maximum number of 'I's.
// If no row contains any 'I's, return -1.

// Example:

// Given the following grids:

// Example 1:
// grid1 = {
//     {'I', 'I', 'e', 'I'},
//     {'e', 'I', 'e', 'I'},
//     {'I', 'e', 'I', 'e'}
// }
// The row with index 0 has 3 'I's, which is the maximum count among all rows. Therefore, the program should return 0.



package D2arrays;

public class MaxIInGrid {
    public static void main(String[] args) {
        char[][] grid1 = {
            {'I', 'I', 'e', 'I'},
            {'e', 'I', 'e', 'I'},
            {'I', 'e', 'I', 'e'}
        };
        char[][] grid2 = {
            {'e', 'e', 'e', 'e'},
            {'e', 'e', 'e', 'e'},
            {'e', 'e', 'e', 'e'}
        };

        int result1 = maxRowWithI(grid1); // Example 1
        int result2 = maxRowWithI(grid2); // Example 2

        System.out.println("Example 1: " + result1);
        System.out.println("Example 2: " + result2);
    }

    public static int maxRowWithI(char[][] grid) {
        int maxICount = 0;
        int maxRowIndex = -1;

        for (int i = 0; i < grid.length; i++) {
            int currentICount = 0;

            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'I') {
                    currentICount++;
                }
            }

            if (currentICount > maxICount) {
                maxICount = currentICount;
                maxRowIndex = i;
            }
        }

        return maxICount > 0 ? maxRowIndex : -1;
}
}