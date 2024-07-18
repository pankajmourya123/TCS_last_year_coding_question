// Title: Remove Spaces from a String

package String;

public class Removespace {
    public static void main(String[] args) {
        String str = "Hello World! Welcome to Java programming.";
        
        // Remove all spaces from the string
        String stringWithoutSpaces = str.replace(" ", "");
        
        // Alternatively, you can use replaceAll with a regular expression
        // String stringWithoutSpaces = str.replaceAll("\\s", "");

        System.out.println("Original string: " + str);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }
}
