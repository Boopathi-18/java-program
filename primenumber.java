public class primenumber
{
    public static void main(String[] args){
        int prime =34,count=0;
        for(int i=1;i<=prime;i++){
            if(prime%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("prime number:"+prime);
        }
        else{
            System.out.println("not prime number:"+prime);
        }
    }
}