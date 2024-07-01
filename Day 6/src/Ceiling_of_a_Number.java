public class Ceiling_of_a_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
        static int ceiling(int[] arr,int target){
        int s=0,l=arr.length;
        while (s<=l) {
            int mid  = s+ (l-s)/2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                l = mid - 1;
            }
        }
        return arr[s];
        }

}
