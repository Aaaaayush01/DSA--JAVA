package Collections;

import java.util.*;

public class linkedBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the book list: ");
        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the book titles: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println("Enter the book to search for: ");
        String search = sc.next();
        int first = 0;
        int last = n - 1;
        for (int i = 0; i <= last; i++) {
            if (list.get(i).equals(search)) {
                first = i;
                break;
            }
        }
        for (int i = last; i >= 0; i--) {
            if (list.get(i).equals(search)) {
                last = i;
                break;
            }
        }
        System.out.println("Book found at index " + first + " at index " + last);
    }
}
