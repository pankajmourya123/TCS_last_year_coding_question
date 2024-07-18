// Problem Statement:
// Write a Java program that generates a modified password based on an initial password and an increment value N:

// Input:

// Read an initial password and an integer N from the user.
// The initial password may contain lowercase letters (a-z), uppercase letters (A-Z), digits (0-9), and a few special characters (@, #, $).
// Output:

// Generate a modified password where each character in the initial password is shifted by N positions:
// For lowercase letters (a-z), shift them cyclically within the lowercase range.
// For uppercase letters (A-Z), shift them cyclically within the uppercase range.
// For digits (0-9), shift them cyclically within the digit range.
// For special characters (@, #, $), shift them as specified (@ -> #, # -> $, $ -> @).


package String;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter initial password: ");
        String password = sc.nextLine();
        System.out.print("Enter increment value: ");
        int N = sc.nextInt();

        String modifiedPassword = generatePassword(password, N);
    }

    public static String generatePassword(String password,int N) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(shiftCharacter(ch, 'a', N));
            } else if (Character.isUpperCase(ch)) {
                result.append(shiftCharacter(ch, 'A', N));
            } else if (Character.isDigit(ch)) {
                result.append(shiftCharacter(ch, '0', N));
            } else {
                // Special characters handling
                switch (ch) {
                    case '@': result.append('#'); break;
                    case '#': result.append('$'); break;
                    case '$': result.append('@'); break;
                    default: result.append(ch); break;
                }
            }
        }
        
        return result.toString();
    }

    public static char shiftCharacter(char ch, char base, int N) {
        int shifted = (ch - base + N) % 26 + base;
        return (char) shifted;
    }
}
