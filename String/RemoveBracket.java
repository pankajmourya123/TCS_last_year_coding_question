// Problem Statement:
// Write a Java program that removes all parentheses (( and )) from a given string and outputs the modified string.

// Input:

// A string str containing alphanumeric characters and parentheses ((, )).
// Output:

// Print the string with all parentheses removed.
// Implementation:

// Create a Java class RemoveBracket with a main method.
// Inside main, initialize a string str with the input value "a+b(a+b)+(a*b)".
// Implement a loop to iterate through each character of the string.
// Append each character to a new string res if it is not a parentheses character (( or )).
// Print the final string res after all characters have been processed.
// Example:

// For the input string "a+b(a+b)+(a*b)", the output should be "a+bab+ab" after removing all parentheses.


package String;

public class RemoveBracket {
 public static void main(String[] args) {
    String str = "a+b(a+b)+(a*b)";
    String res = "";

    for (char s : str.toCharArray()) {
        if (s != '(' && s != ')') {
            res += s;
        }
    }
    System.out.println(res);
 } 
 
 public void replace(String str){
    String res=str.replaceAll("[\\[\\](){}]","");
 }
}
