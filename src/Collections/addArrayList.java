package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class addArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("Enter the index to be updated: ");
        int index = input.nextInt();
        System.out.println("Enter the new value to be updated: ");
        int newValue = input.nextInt();
        list.set(index, newValue);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
