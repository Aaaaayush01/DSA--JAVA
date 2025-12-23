package Misc;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.next();
        }
        Arrays.sort(students);
        String search = sc.next();
        int start = 0;
        int end = students.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (students[mid].equals(search)) {
                System.out.println(mid);
            } else if () {
                
            }
        }
    }
}
