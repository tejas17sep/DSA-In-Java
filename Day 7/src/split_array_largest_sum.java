public class split_array_largest_sum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int y = splitArray(nums,k);
        System.out.println(y);
    }
    static int splitArray(int[] nums, int k) {
        int s = 0,e = 0;
        for (int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        //Binary Search
        while (s<e){
            int  mid = s + (e-s)/2;
            int sum=0,piece=1;
            for (int num:nums){
                if (sum+num>mid){
                    sum=num;
                    piece++;
                }
                else {
                    sum+=num;
                }

            }
        if (piece>k){
            s=mid+1;
        }
        else {
            e=mid;
        }
        }
        return e;
    }
}
