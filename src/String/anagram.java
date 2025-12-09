package String;

import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String:");
        String first = scanner.next();
        System.out.println("Enter second String:");
        String second = scanner.next();
        char[] arr = first.toCharArray();
        Arrays.sort(arr);
        char[] arr1 = second.toCharArray();
        Arrays.sort(arr1);
        first = new String(arr);
        second = new String(arr1);
        if(first.equals(second)){
            System.out.println("The Strings are anagrams.");
        }
        else{
            System.out.println("The Strings are not anagrams.");
        }
    }
}
