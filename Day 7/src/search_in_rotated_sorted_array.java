public class search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;
        int ans = pivot( nums);
        System.out.println(ans);
    }

    static int search(int[] nums,int target,int s,int l){
        int x= pivot( nums);
        // if we didi not grt the pivot means the array was not rotated
        // so just do normal binary search
        if (x==-1){
            // just do normal binary search
            return binarySearch(nums,target,0,nums.length);
        }
        if (nums[x]==target){
            return x;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0,x-1);
        }
        return binarySearch(nums,target,0,nums.length-1);
    }
    static int binarySearch(int[] nums, int target, int s, int l) {
        while (s < l) {
            int mid = s + (l - s) / 2;
            if (target < nums[mid]) {
                l = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
            static int pivot(int[] nums){
            int s = 0, l = nums.length - 1;

            while (s <= l) {
                int mid = s + (l - s) / 2;
                if (mid < l && nums[mid] > nums[mid + 1]) {
                    return l = mid;
                }
                if (mid > s && nums[mid] < nums[mid - 1]) {
                    return s = mid - 1;
                }
                if (nums[s] >= nums[mid]) {
                    l = mid - 1;
                } else {
                    s = mid + 1;
                }

            }
            return -1;
             }

}