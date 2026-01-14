package String;

import java.util.Scanner;

public class revWordOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("\\s+");
        int n = strArr.length;
        for (int i = 0; i < n; i++) {
            StringBuilder reversed =  new StringBuilder(strArr[i]).reverse();
            reversed.append(" ");
            System.out.print(reversed);
        }
    }
}
