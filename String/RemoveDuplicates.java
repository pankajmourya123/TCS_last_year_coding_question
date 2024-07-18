package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
  
        String[] fruits = input.split(" ");

HashSet<String> hs=new HashSet<>();
ArrayList<String> arr=new ArrayList<>();

        for (int i = 0; i < fruits.length; i++) {
            hs.add(fruits[i]);
        }

        for (String string : hs) {
            arr.add(string);
        }

        System.out.println(arr);
      


        // Set<String> uniqueFruits = new LinkedHashSet<>();
        // Collections.addAll(uniqueFruits, fruits);

        // // Convert Set to ArrayList for sorting
        // List<String> sortedFruits = new ArrayList<>(uniqueFruits);
        // Collections.sort(sortedFruits);
        
        // // Print ascending order
        // for (String fruit : sortedFruits) {
        //     System.out.print(fruit + " ");
        // }
        // System.out.println(); // New line
        
        // // Print descending order
        // Collections.reverse(sortedFruits);
        // for (String fruit : sortedFruits) {
        //     System.out.print(fruit + " ");
        // }




    }
}
