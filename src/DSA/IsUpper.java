package DSA;

import java.util.Scanner;

public class IsUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character :");
        char a = sc.next().charAt(0);
        int num = (int)a;
        if (num >= 65 && num <= 90) { /* if ch >= 'a' && ch <= 'z' */
            System.out.println("Upper Letter");
        }
        else if (num >= 97 && num <= 122) {
            System.out.println("Lower Letter");
        }
        else {
            System.out.println("Enter a alphabet");
        }
    }
}
