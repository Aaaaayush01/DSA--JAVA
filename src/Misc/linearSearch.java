package Misc;

import java.util.Scanner;

public class linearSearch {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of items in inventory: ");
        int n = input.nextInt();
        String[] items = new String[n];
        System.out.print("Enter the items in the inventory: ");
        for (int i = 0; i < n; i++) {
            items[i] = input.next();
        }
        System.out.println("Enter the item you want to look for: ");
        String search = input.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (items[i].equals(search)) {
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product Not found");
        }
        else  {
            System.out.println("Product Found");
        }
    }
}
