package String;

import java.util.Scanner;

public class splitJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(String s: arr){
            System.out.println(s);
        }
        sc.close();
        String joined = String.join(" ", arr);
        System.out.println(joined);
    }
}
