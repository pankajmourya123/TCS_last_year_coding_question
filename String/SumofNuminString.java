// Problem Statement
// Title: Sum of Numbers in a String

package String;

public class SumofNuminString {
    public static void main(String[] args) {
        String str="tyyfvv 5 and 6";
        String [] arr=str.split(" ");
int sum=0;
        for (String s : arr) {
            char t=s.charAt(0);
            if(Character.isDigit(t)){
                sum+=Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}
