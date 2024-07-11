public class search_insert_position {
    public static void main(String[] args) {
     //   https://leetcode.com/problems/search-insert-position/

        int [] nums = {1,3,5,6};
        int target = 0;
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if (nums[mid]==target){
                System.out.println(mid);
            }
            else if (nums[mid]<target) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }

        }
        System.out.println(s);
    }
}
