package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedListAddFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tasks to be done: ");
        int n = sc.nextInt();
        LinkedList <String> tasks = new LinkedList<>();
        System.out.println("Enter the tasks you want to be done: ");
        for(int i = 0; i < n; i++){
            tasks.addFirst(sc.next());
        }
        System.out.println("The size of the linkedList is: " + tasks.size());
        for(String task : tasks){
            System.out.println(task);
        }
        System.out.println("First Element: " + tasks.getFirst());
        System.out.println("Last Element: " + tasks.getLast());
        System.out.println("Remove Last: " + tasks.removeLast());
        System.out.println("New Size: " + tasks.size());
    }
}
