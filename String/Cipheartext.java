// Problem Statement:
// Write a Java program to encrypt a string str using a Caesar cipher with a given key k. The encryption should shift each character in str by k positions in the ASCII table, preserving the case for alphabets and wrapping around for letters and digits.

package String;

public class Cipheartext {
    public static void main(String[] args) {
        String str = "pankaj";
        int key = 2;

        String out = encrypt(str, key);
        System.out.println(out);
    }

    public static String encrypt(String str, int k) {
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                res.append((char) ('A' + (ch - 'A' + k) % 26));
            } else if (ch >= 'a' && ch <= 'z') {
                res.append((char) ('a' + (ch - 'a' + k) % 26));
            } else if (ch >= '0' && ch <= '9') {
                res.append((char) ('0' + (ch - '0' + k) % 10));
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

}
