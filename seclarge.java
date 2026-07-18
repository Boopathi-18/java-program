public class seclarge {
    public static void main(String[] args) {
        int [] arr={5,5,5};
        int l=Integer.MIN_VALUE;
         int sl=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
        }if(l==sl)
         System.out.println("largest element:"+l);   
         else
            System.out.println("second largest element:none(all elements are same)"+sl); 

    }
}
