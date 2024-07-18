// Problem Statement: Find Symmetric Pairs

// You need to write a program that reads pairs of integers and identifies symmetric pairs. A symmetric pair (a, b) is such that there exists another pair (b, a) in the input.

// Input:

// The program prompts the user to enter the number of pairs n.
// It then prompts for n pairs of integers, where each pair consists of two integers.
// Output:

// For each symmetric pair found in the input, print Symmetric pair found: a <-> b, where a and b are the integers forming the symmetric pair (a, b) and (b, a).
// Example:

// Input:
// Enter the number of pairs:
// 4
// Enter the pairs (two integers per line):
// 1 2
// 3 4
// 5 6
// 2 1
// Output:
// Symmetric pair found: 1 <-> 2
// Explanation:

// In the input pairs, (1, 2) and (2, 1) form a symmetric pair.
// Therefore, the program identifies and prints Symmetric pair found: 1 <-> 2.

import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of pairs:");
        int n = scanner.nextInt();

        int[][] pairs = new int[n][2];

        System.out.println("Enter the pairs (two integers per line):");
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }   
        HashMap<Integer,Integer> sympair=new HashMap<>();

        for (int[] is : pairs) {
            int f=is[0];
            int s=is[1];

            if(sympair.containsKey(s)&& sympair.get(s)==f){
                System.out.println("Symmetric pair found: " + f + " <-> " + s); 
            }else{
                sympair.put(f, s);
            }
        }
    }
}
