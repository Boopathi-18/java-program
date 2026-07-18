public class jaged {
    public static void main(String[] args) {
        int arr[]={60,40,10,20},k=2,max=0;
        int sum =0;
        for(int i=0;i<k;i++){
          sum+=arr[i];//first window 
          max=sum;        
            }
            for(int i=k;i<arr.length;i++){
                sum=(sum-arr[i-k])+arr[i];
            if(sum>max){
                max=sum;
            }
            
        }
        System.out.println("maxsub array:"+max);
    }
}

