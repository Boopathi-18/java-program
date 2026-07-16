import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(m>0&&m<100){
        if(m>=90){
            System.out.println("Grade A");
        }
        else if(m>=75&&m>90){
            System.out.println("Grade B");
        }
        else if(m>=60&&m>75){
            System.out.println("Grade C");
        }
        else if(m>=40&&m>60){
            System.out.println("Grade D");
        }
        else if(m<=40){
            System.out.println("Grade F");
        }
        
        return;
        
    
    

    }
    System.out.println("invalid marks");
}
}
