// Problem Statement:
// Write a Java program to count the number of vowels, consonants, and spaces in a given string str. The program should treat uppercase and lowercase letters equivalently and ignore any other characters.



package String;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello World!";
        int vowels = 0, consonants = 0, spaces = 0;
        
        // Convert the string to lowercase to simplify the comparison
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check for spaces
            else if (ch == ' ') {
                spaces++;
            }
            // Check for consonants (ignoring non-alphabetic characters)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of spaces: " + spaces);
    }
}
