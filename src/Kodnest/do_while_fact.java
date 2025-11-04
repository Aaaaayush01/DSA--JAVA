package Kodnest;

public class do_while_fact {
    public static void main(String[] args) {
        int fact1 = 3;
        int fact2 = 5;
        int fact3 = 1;
        int fact5 = 1;
        int i = 1;
        do {
            fact3 = fact3 * i;
            i++;
        } while (i <= fact1);
        System.out.println(fact3);

        int j = 1;
        do {
            fact5 = fact5 * j;
            j++;
        } while (j <= fact2);
        System.out.println(fact5);
    }
}
//