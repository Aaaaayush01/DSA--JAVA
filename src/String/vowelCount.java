package String;

import java.util.Scanner;

public class vowelCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // TODO: Ask user for input string
            System.out.println("Enter a String:");
            String str = scanner.nextLine();

            // TODO: Count vowels in the string
            System.out.println("Original String: " + str);

            int length = str.length();
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = str.charAt(i);
            }

            int count = 0;

            for (int j = 0; j < length; j++) {
                if (arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U' || arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
                    count++;
                }
            }

            System.out.println("Number of vowels: " + count);

            // TODO: Print the original string and the count of vowels
            scanner.close();
    }
}
