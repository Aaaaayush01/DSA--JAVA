package String;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        System.out.println("The original string is : "+str);
        System.out.println("The original character is : "+ch);
        int count = 0;
        for(int i=0; i<str.length();i++) {
            if(str.charAt(i)==ch) {
                count++;
            }
        }
        System.out.println("The number of times it occurs is: "+count);
    }
}
