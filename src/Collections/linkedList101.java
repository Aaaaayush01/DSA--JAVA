package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedList101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextLine());
        }
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());
        System.out.println(list);
    }
}
