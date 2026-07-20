public class rswap {
     public static void main(String[] args) {
       int  arr[]={-2,-4,3,5,7};
       int n=arr.length;
       int d=2;
for(int i=0;i<d;i++){
    for(int j=n-1;j>0;j--){
      int temp=arr[j];
      arr[j]=arr[j-1];
      arr[j-1]=temp;
    }
}
// System.out.println(Arrays.toString(arr));
for(int a:arr)
    System.out.print(a+" ");
}
}
