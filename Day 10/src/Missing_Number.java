import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
public class Missing_Number {
    public static void main(String[] args) {
        int [] nums = {4,0,2,1};
        missingNumber(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;}
            else
                i++;
        }
        for(int j = 0 ; j<nums.length;j++){
            if (nums[j] != j){
                System.out.println(j);
            }
        }



    }
}
