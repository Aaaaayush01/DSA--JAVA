package DSA;

public class MixedString {
    public static void main(String[] args) {
        String a = "KodNest123@#456";
        int n = a.length();
        int cons = 0;
        int vowels = 0;
        int num = 0;
        int spec = 0;

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                cons++;
            }
            else if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                cons++;
            }
            else if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                num++;
            }
        }
        System.out.println("cons: " + cons);
        System.out.println("vowels: " + vowels);
        System.out.println("num: " + num);
        System.out.println("spec: " + spec);
    }
}
