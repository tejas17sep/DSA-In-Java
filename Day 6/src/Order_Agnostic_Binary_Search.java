public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 10, 26, 28, 34, 45, 56, 57, 68, 72, 84, 91, 99};
        int find = 72;
        int ans = Binary_Search(arr, find);
        System.out.println(ans);
    }

    static int Binary_Search(int[] arr, int find) {
        int s = 0, l = arr.length - 1, mid;
        boolean isAsc = arr[s] < arr[l];
        while (s <= l) {
            mid = s + (l - s) / 2;
            //If the Middle Element is equal to target
            if (arr[mid] == find) {
                return mid;
            }
            //If the Array is in Asc Order
            if (isAsc) {
                if (find < arr[mid]) {
                    l = mid - 1;
                } else if (find > arr[mid]) {
                    s = mid + 1;
                }
            }
                // If the Array is in Decending Order
            else {
                if (find > arr[mid]) {
                    l = mid - 1;
                } else  {
                    s = mid + 1;
                }
            }

        }
        return -1;
    }

}