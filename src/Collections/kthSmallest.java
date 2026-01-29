package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class kthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> pq = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        System.out.println("Enter the number you want: ");
        int num = sc.nextInt();
        System.out.println(pq);
    }
}
