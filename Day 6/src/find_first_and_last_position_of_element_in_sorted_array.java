public class find_first_and_last_position_of_element_in_sorted_array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,13,14,15,16,17,18,21,22,23,24,25,26,27};
        int target = 23;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        int s = 0, l = 1;
        while (target > arr[l]) {
            int temp = l+1;
            l = l + (l - s + 1) * 2;
            s = temp;

        }
        return binarySearch(arr, target, s, l);
    }

    static int binarySearch(int[] arr, int target, int s, int l) {
        while (s <= l) {
            int mid = s + (l - s) / 2;

            if (target < arr[mid]) {
                l = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}
