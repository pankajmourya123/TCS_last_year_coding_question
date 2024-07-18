// Problem Statement: Shipping Cost Calculator
// Create a Java program to calculate the shipping cost for a package based on its weight and the distance it needs to travel.

// Steps:
// Input:

// Prompt the user to enter the weight of the package in kilograms.
// Prompt the user to enter the distance the package needs to travel in kilometers.
// Calculation:

// Define the base shipping cost.
// Define the cost per kilogram.
// Define the cost per 10 kilometers.
// Calculate the shipping cost based on the following formula:
// Total Cost=Base Cost+(Weight×Cost per Kilogram)+( Distance/10×Cost per 10 Kilometers)
// Output:
// Display the total shipping cost formatted to two decimal places.
// Example:
// Input:
// Weight: 3.5 kilograms
// Distance: 45 kilometers
// Calculation:
// Base Cost: $5.00
// Cost per Kilogram: $2.00
// Cost per 10 Kilometers: $5.00
// Weight Cost=3.5×2.00=7.00
// Distance Cost=(45/10)×5.00=22.50
// Total Shipping Cost=5.00+7.00+22.50=34.50
// Output: Total shipping cost: $34.50



package Math;

import java.util.Scanner;

public class calculateShippingCost {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        // Input weight of the package in kilograms
        System.out.println("Enter the weight of the package (in kilograms):");
        double weight = sc.nextDouble();

        // Input distance the package needs to travel in kilometers
        System.out.println("Enter the distance the package needs to travel (in kilometers):");
        double distance = sc.nextDouble();

        // Calculate the total shipping cost
        double totalCost = calculateShippingCost(weight, distance);

        // Output the total shipping cost
        System.out.printf("Total shipping cost: $%.2f\n", totalCost); 
    }

    public static double calculateShippingCost(double weight,double distance){
        double baseCost = 5.00;

        // Cost per kilogram
        double costPerKilogram = 2.00;

        // Cost per 10 kilometers
        double costPer10Kilometers = 5.00;

        // Calculate cost based on weight
        double weightCost = weight * costPerKilogram;

        // Calculate cost based on distance
        double distanceCost = (distance / 10) * costPer10Kilometers;

        // Total cost
        double totalCost = baseCost + weightCost + distanceCost;

        return totalCost;
    }
}
