public class armstrong{
    public static void main(String[] args){
        int n=153,r,sum=0;
        int temp=n;
        while(n>0){
            r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        if(temp==sum){
            System.out.println("armstrong number:"+sum);
        }
        else{
            System.out.println("not armstrong number:"+sum);
        }
    }
}