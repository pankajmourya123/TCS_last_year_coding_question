// Problem Statement: Calculate the Number of Pairs of Shoes

// You need to write a program that reads an array of shoe sizes, where each shoe is indicated by its size followed by 'L' (left) or 'R' (right). The program then calculates and prints the number of valid pairs of shoes where each pair consists of one left shoe and one right shoe of the same size.

// Input:

// The first line contains an integer n, the number of shoes.
// The second line contains n strings, each representing a shoe size followed by 'L' or 'R'.
// Output:

// Print the number of valid pairs of shoes.
// Example:

// Input:

// 6
// 10L 11R 10R 10L 12R 12L
// Output:
// 2

// Explanation:

// In the input, there are:
// Two left shoes of size 10 (10L and 10L).
// One right shoe of size 10 (10R).
// One right shoe of size 11 (11R).
// One left shoe of size 12 (12L).
// One right shoe of size 12 (12R).
// Therefore, there are 2 pairs of shoes: one pair of size 10 and one pair of size 12.
// Note:

// The program uses two HashMaps, left and right, to count occurrences of left and right shoes for each size.
// It then iterates through left and checks if there are corresponding sizes in right to count valid pairs.
// The output is the total count of valid pairs of shoes.
import java.util.HashMap;
import java.util.Scanner;

public class Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer input

        String[] shoes = sc.nextLine().split(" ");

        HashMap<String, Integer> left = new HashMap<>();
        HashMap<String, Integer> right = new HashMap<>();

        for (String s : shoes) {
            String size = s.substring(0, s.length() - 1);
            char type = s.charAt(s.length() - 1);

            if (type == 'L') {
                left.put(size, left.getOrDefault(size, 0) + 1);
            } else if (type == 'R') {
                right.put(size, right.getOrDefault(size, 0) + 1);
            }
        }

        int pairs = 0;
        for (String size : left.keySet()) {
            if (right.containsKey(size)) {
                pairs += Math.min(left.get(size), right.get(size));
            }
        }

        System.out.println(pairs);
    }
}
