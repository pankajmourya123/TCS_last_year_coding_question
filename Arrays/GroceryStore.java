// The provided code is a Java program that simulates a grocery store's sales system. It allows the user to input multiple items, their quantities, and prices, then calculates and displays the highest selling item, total sales, and average sales.

// Problem Description
// Write a program that:

// Reads the number of items.
// Reads the name, quantity, and price of each item.
// Calculates the total sales for each item and keeps track of the overall total sales.
// Determines and prints the highest selling item.
// Calculates and prints the total sales and average sales per item.
// Input Format:

// The number of items.
// For each item, input the item name, quantity, and price, space-separated.
// Output Format:

// The highest selling item.
// The total sales, formatted to two decimal places.
// The average sales per item, formatted to two decimal places.
// Example:

// Input:

// Enter the number of items:
// 3
// Enter item name, quantity, and price (space-separated):
// Apple 10 2.5
// Banana 5 1.2
// Orange 7 3.0


// Highest Selling Item: Orange
// Total Sales: 41.00
// Average Sales: 13.67

// Explanation:

// The total sales for each item are calculated as:
// Apple: 10×2.5=25.00
// Banana: 5×1.2=6.00
// Orange: 7×3.0=21.00
// The total sales are 25.00+6.00+21.00=52.00.
// The average sales per item is 52.00/3 ≈ 13.67
// The highest selling item is "Orange" with sales of 21.00.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = Integer.parseInt(sc.nextLine());

        // Store items in a map
        Map<String, Double> itemSales = new HashMap<>();
        double totalSales = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter item name, quantity, and price (space-separated):");
            String[] input = sc.nextLine().split(" ");
            String itemName = input[0];
            int quantity = Integer.parseInt(input[1]);
            double price = Double.parseDouble(input[2]);

            double itemTotal = quantity * price;
            totalSales += itemTotal;

            // Add or update item in the map
            itemSales.put(itemName, itemSales.getOrDefault(itemName, 0.0) + itemTotal);
        }

        // Determine highest selling item
        String highestSellingItem = "";
        double highestSales = 0;

        for (Map.Entry<String, Double> entry : itemSales.entrySet()) {
            if (entry.getValue() > highestSales) {
                highestSales = entry.getValue();
                highestSellingItem = entry.getKey();
            }
        }

        // Calculate average sales
        double averageSales = totalSales / n;

        // Output results
        System.out.printf("Highest Selling Item: %s%n", highestSellingItem);
        System.out.printf("Total Sales: %.2f%n", totalSales);
        System.out.printf("Average Sales: %.2f%n", averageSales);

        sc.close();
    }
}
