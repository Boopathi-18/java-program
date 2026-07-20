import java.util.*;
public class rigthrotate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ar[]={-2,-4,3,5,7};
        int n=ar.length;
        int last=ar[n-1];
        for(int i=n-1;i>0;i--){
            ar[i]=ar[i-1];
        }
        ar[0]=last;
          for(int j=0;j<n;j++){

            System.out.print(ar[j]);
            if(j<n-1)
                System.out.print(",");
        }

    }
}