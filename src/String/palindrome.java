package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        int n  = str1.length();
        char[] arr = new char[n];
        for(int i=0;i<n;i++) {
            arr[i] = str1.charAt(n-1-i);
        }
        String rev = new String(arr);
        if(rev.equals(str1)) {
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("The String is not Palindrome");
        }
    }
}
