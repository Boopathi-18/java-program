public class subarr {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50},k=3,max=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum =0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
            
        }
        System.out.println("maxsub array:"+max);
    }
}
