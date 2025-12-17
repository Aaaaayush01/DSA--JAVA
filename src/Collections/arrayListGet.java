package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListGet {
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
        System.out.println("Enter the index of the element you want");
        int x = sc.nextInt();
        System.out.println(arr.get(x));
    }
}
