package Kodnest;

public class Do_while_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            int j = 1;
            while (j <= 3) {
                int k = 1;
                do {
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                    k++;
                } while (k <= 2);
                j++;
            }
        }
    }
}
