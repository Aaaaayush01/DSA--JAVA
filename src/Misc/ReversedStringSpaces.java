package DSA;
import java.util.Scanner;

public class ReversedStringSpaces {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input from user
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            char[] arr = input.toCharArray();

            int i = 0, j = arr.length - 1;

            // Brute force swapping
            while (i < j) {
                if (arr[i] == ' ') {
                    i++;
                } else if (arr[j] == ' ') {
                    j--;
                } else {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            System.out.println("Reversed string (spaces preserved): " + new String(arr));
        }
    }