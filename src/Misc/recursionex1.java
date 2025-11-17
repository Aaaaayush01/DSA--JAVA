package DSA;

public class recursionex1 {
    static int count = 1;
    public static void printMessage() {
        System.out.println(count);
        count++;
        if (count > 10) {
            return;
        }
        printMessage();
    }
    public static void main(String[] args){
        System.out.println("Calling a recursive function below.");
        printMessage();
    }
}
