package DSA;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        char[] rev = new char[n];

        int j = rev.length - 1;
        for (int i = 0; i < n; i++) {
            rev[j] = str.charAt(i);
            j--;
        }
        String reversed = new String(rev);
        if (str.equals(reversed)) {
            System.out.println("Palindrome!!");
        }
        else {
            System.out.println("Not Palindrome!!");
        }
    }
}