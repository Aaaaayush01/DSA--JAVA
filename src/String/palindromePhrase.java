package String;

import java.util.Arrays;
import java.util.Scanner;

public class palindromePhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] strArr = str.split(" ");
        for (String word : strArr) {
            char[] chars = word.toCharArray();
            char[] newChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                newChars[i] = chars[chars.length - i - 1];
            }
            if (!Arrays.equals(newChars, chars)) {
                return false;
            }
        }
        return true;
    }
}
