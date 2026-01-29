package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class productCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products in Electronics category: ");
        int n = sc.nextInt();
        TreeSet<String> electronics = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            electronics.add(sc.next());
        }
        System.out.println("Enter the number of products in Home Appliances category: ");
        int m = sc.nextInt();
        TreeSet<String> home = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            home.add(sc.next());
        }

    }
}
