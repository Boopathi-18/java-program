import java.util.Scanner;
public class perfect {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),p=1,c=0;
	while(n>0) {
		int d=n%10;
		p*=d;
		c+=d;
		n/=10;
	}if(p==c) {
		System.out.println("Perfrct number");
	}else {
		System.out.println("Not Perfrct number");
	}
}
}
