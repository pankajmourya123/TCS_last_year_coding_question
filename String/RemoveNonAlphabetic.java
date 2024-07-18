// Problem Statement
// Title: Remove Non-Alphabetic Characters from a String


package String;

public class RemoveNonAlphabetic {
    public static void main(String[] args) {
        String str = "Hello World! Welcome to Java programming 123.";
        
        // Remove all non-alphabetic characters
        String alphabetOnly = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("Original string: " + str);
        System.out.println("String with only alphabets: " + alphabetOnly);
    }
}
