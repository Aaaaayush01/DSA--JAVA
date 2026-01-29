package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class techStack {
    public static void main(String[] args) {
        TreeSet<String>  pq = new TreeSet<>();
        pq.add("Java");
        pq.add("Python");
        pq.add("JavaScript");
        pq.remove("Python");
        if (pq.contains("Java")) {
            System.out.println("Python exists.");
        }
        pq.contains("Java");
        System.out.println(pq);
        System.out.println(pq.first());
        System.out.println(pq.last());
    }
}
