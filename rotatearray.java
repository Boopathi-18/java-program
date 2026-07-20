import java.util.*;

class rotatearray {
    public static void rotate(int[] nums, int k) {
        int l=nums.length;
        int t[]=new int[l];
                for(int i=0;i<l;i++){
            t[(k+i)%l]=nums[i];
        }
        for(int i=0;i<l;i++)
        nums[i]=t[i];

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        rotate(nums, k);
    }
}