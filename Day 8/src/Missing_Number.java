public class Missing_Number {

    public static void main(String[] args) {
       int [] nums = {9,6,4,2,3,5,7,0,1};
       int ans = xyz(nums);
       System.out.println(ans);

    }
    static int xyz(int[] nums) {
        int XOR = 0;
        for(int i=0;i<=nums.length;i++){
            XOR = XOR ^ i;

        }
        for(int num : nums){
            XOR = XOR ^ num;
        }
        return XOR;
    }

}
