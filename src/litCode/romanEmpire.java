package litCode;

import java.util.Scanner;

public class romanEmpire {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roman number: ");
        String str = sc.nextLine().toUpperCase();

        // Subtractive patterns (with spaces)
        str = str.replace("CM", " 900 ");
        str = str.replace("CD", " 400 ");
        str = str.replace("XC", " 90 ");
        str = str.replace("XL", " 40 ");
        str = str.replace("IX", " 9 ");
        str = str.replace("IV", " 4 ");

        // Remaining numerals
        str = str.replace("M", " 1000 ");
        str = str.replace("D", " 500 ");
        str = str.replace("C", " 100 ");
        str = str.replace("L", " 50 ");
        str = str.replace("X", " 10 ");
        str = str.replace("V", " 5 ");
        str = str.replace("I", " 1 ");

        String[] parts = str.trim().split("\\s+");

        int total = 0;
        for (String part : parts) {
            total += Integer.parseInt(part);
        }

        System.out.println(total);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roman number: ");
        String str = sc.nextLine();
        int total = 0;
        int prev = 0;
        for (int i = str.length()-1; i>= 0; i--) {
            int curr = valueOf(str.charAt(i));
            if (curr < prev) {
                total -= curr;
                prev = curr;
            }
            else {
                total += curr;
            }
            prev = curr;
        }
        System.out.println(total);
    }
    private static int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
