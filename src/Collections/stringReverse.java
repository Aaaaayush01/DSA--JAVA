package Collections;

import java.util.ArrayDeque;
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            dq.offer(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            Character c = dq.removeLast();
            sb.append(c);
        }
        System.out.println(sb);
    }
}
