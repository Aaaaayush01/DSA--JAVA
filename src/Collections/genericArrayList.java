package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class genericArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("The elements in the array are: " + list);

    }
}
