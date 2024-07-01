public class Floor_of_a_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Floor(arr,target);
        System.out.println(ans);
    }
    static int Floor(int[] arr, int target){
        int s=0, l = arr.length;
        while (s<=l) {
            int mid = s + (l - s) / 2;
            if (target<arr[mid]){
                l=mid-1;
            } else if (target>mid) {
                s=mid+1;
            }
            else {
                return arr[mid];
            }

        }
        return arr[l];
    }
}
