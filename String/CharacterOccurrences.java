// Problem Statement:
// Write a Java program to find the number of occurrences of substring s2 in string s1


package String;

public class CharacterOccurrences {
 public static void main(String[] args) {
    String s1 = "developer";
        String s2 = "dev";
        int result1 = sumCharacterOccurrences(s1, s2); // Example 1
        System.out.println("Example 1: " + result1);
 }  
 
 public static int sumCharacterOccurrences(String s1,String s2){
    int sum=0;
    

    for (int i = 0; i <=s1.length() - s2.length() ; i++) {
        if(s1.substring(i,i+s2.length()).equals(s2)){
            sum++;
        }
    }
    return sum;
 }
}
