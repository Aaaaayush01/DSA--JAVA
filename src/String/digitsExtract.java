package String;

import java.util.Arrays;
import java.util.Scanner;

public class digitsExtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for(char c : arr){
            if ("0123456789".indexOf(c) != -1) {
                System.out.print(c);
            }
        }
    }
}
