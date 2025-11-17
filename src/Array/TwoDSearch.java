package DSA;

import java.util.Scanner;

public class TwoDSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element you want to look for: ");
        int search = sc.nextInt();

        boolean found = false;

        SearchLoop:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == search) {
                    System.out.println("Found at position (" + i + ", " + j + ")");
                    found = true;
                    break SearchLoop;  // exit both loops at once
                }
            }
        }


        /* for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == search) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("The element you entered is present in the array at: " + index);
        }
        else {
            System.out.println("No match");
        } */
    }
}
