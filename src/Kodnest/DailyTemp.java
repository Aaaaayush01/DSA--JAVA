package Kodnest;
import java.util.Arrays;

public class DailyTemp {
    public static void main(String[] args) {
        int[] a = {73,74,75,71,69,72,76,73};
        int n = a.length;
        int [] res = new int[n];
        for (int i = 0; i <= n-1; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                if (a[j] > a[i]) {
                    res[i] = j-i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
