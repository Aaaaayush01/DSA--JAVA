package String;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the sub-string: ");
        String str2 = sc.nextLine();
        if  (str1.indexOf(str2) == -1) {
            System.out.println("Substring Not Found");
        }
        else {
            System.out.println("Substring Found");
        }
    }
}
