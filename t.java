import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt();
        int original = p; // Store the original number
        int d = 0;

        while (p > 0) {
            int r = p % 10;
            d = d * 10 + r;
            p = p / 10;
        }

        if (original == d) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        s.close();
    }
}