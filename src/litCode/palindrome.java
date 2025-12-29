package litCode;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = sc.nextLine();
        String reversed = "";
        System.out.println("Original: " + n);
        for (int i = n.length() - 1; i >= 0; i--) {
            reversed += n.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
        if (n.equals(reversed)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
