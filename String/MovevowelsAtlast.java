// Problem Statement:
// Write a Java program that moves all vowels in a given string s to the end of the string, while maintaining the relative order of consonants and vowels.


package String;

public class MovevowelsAtlast {
    public static void main(String[] args) {
        String s1 = "welcome to tcs digital";
        String s2 = "what is the tcs ?";

        String result1 = moveVowels(s1);
        String result2 = moveVowels(s2);

        System.out.println("Output for \"" + s1 + "\": " + result1);
        System.out.println("Output for \"" + s2 + "\": " + result2);
    }

    public static String moveVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        // Traverse the string and categorize vowels and consonants
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                vowels.append(ch);
            } else if (Character.isLetter(ch)) {
                consonants.append(ch);
            } else {
                consonants.append(ch); // to handle non-letter characters
            }
        }

        // Return the string with consonants followed by vowels
        return consonants.toString() + vowels.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
