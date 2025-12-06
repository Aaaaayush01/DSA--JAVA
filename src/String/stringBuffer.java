package String;

import java.util.Scanner;

public class stringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("Enter third string: ");
        String str3 = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append(str2);
        sb.append(str3);
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}
