package String;

import java.util.Arrays;
import java.util.Scanner;

public class spacedReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        char[] result = new char[arr.length];

        // Step 1: preserve spaces
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: fill characters in reverse order, skipping spaces
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (result[i] == ' ') {
                continue;
            }

            while (j >= 0 && arr[j] == ' ') {
                j--;
            }

            result[i] = arr[j];
            j--;
        }

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reversed with spaces: " + Arrays.toString(result));
        System.out.println("Final String: " + new String(result));
    }
}
