import java.util.Scanner;
public class arr {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int k:a){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int i=n-1;i>=0;i--)
        System.out.print5(a[i]+" ");
    }
}