package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("The size of the array is: " + arr.size());
        System.out.println("The elements in the array are: " + arr);
        System.out.println("Enter the value you want at index 3");
        arr.set(3, sc.nextInt());
        System.out.println("The elements in the array are: " + arr);
    }
}
