package DSA;

/* public class Pattern106 {
    public static void main(String[] args) {
        int n = 5;  // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
*/
public class Pattern106 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=(5-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
