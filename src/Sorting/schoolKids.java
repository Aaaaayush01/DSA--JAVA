package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class schoolKids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        String[] students = new String[n];
        System.out.println("Enter the students: ");
        for (int i = 0; i < n; i++){
            students[i] = sc.next();
        }
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("Enter the student name you want to look for: ");
        String name = sc.next();
        for (int i = 0; i < n; i++){
            if (students[i].equals(name)){
                System.out.println("Student Found: " + students[i]);
            }
        }
    }
}
