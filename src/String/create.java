package String;

import java.util.Scanner;

public class create {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter another String");
        String str2 = new String(sc.nextLine());
        System.out.println(str2);
        if(str.equals(str2)){
            System.out.println("Strings are the same");
        }
        else{
            System.out.println("Strings are not the same");
        }
    }
}
