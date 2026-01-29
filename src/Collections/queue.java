package Collections;

import java.awt.print.Book;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the queue: ");
        int n = input.nextInt();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(input.next());
        }
        System.out.println(queue);
    }
}
