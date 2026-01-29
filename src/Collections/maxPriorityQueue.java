package Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class maxPriorityQueue {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Queue : ");
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }
        System.out.println("Enter the new task priority: ");
        int q = sc.nextInt();
        pq.offer(q);
        pq.poll();
        System.out.println("Updated Priority Queue of Tasks Priorities: ");
        System.out.println(pq);
    }
}
