import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=n;
        int r=0;
        while (n>0) {
            k%=10;
            r=r*10+1;
            n/=10;
        }
        if (k==r) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome"

            );
        }

    }
    
}
