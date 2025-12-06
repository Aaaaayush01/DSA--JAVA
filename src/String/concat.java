package String;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("Length of the new String is: " + str3.length());
        System.out.println(str3.indexOf(str2));
        System.out.println(str3.indexOf(str1));
        System.out.println(str3.indexOf("D"));
        System.out.println(str3.charAt(9));
        System.out.println(str3.substring(6,10));
        System.out.println(str3.toUpperCase());
    }
}
