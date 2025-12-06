package String;

import java.util.Scanner;

public class immutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String str = sc.nextLine();
        System.out.println("Enter suffix");
        String str2 = new String(sc.nextLine() + " " + str);
        System.out.println("Original: " + str);
        System.out.println("Modified: " + str2);
        if (str.equals(str2)) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    }
}
