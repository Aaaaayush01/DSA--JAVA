package litCode;

import java.util.Arrays;
import java.util.Scanner;

public class anaGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = m.toCharArray();
        Arrays.sort(arr2);
        int n = arr.length;
        int p = arr2.length;
        boolean anagram = Arrays.equals(arr, arr2);

        if (anagram) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
