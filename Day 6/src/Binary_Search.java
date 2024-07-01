import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {23, 32, 45, 56, 67, 85, 96, 100, 125, 365,632};
        int find = 100;
        int ans = binary( arr, find);
        System.out.println(ans);
    }

        static int binary(int[] arr,int find){

        int s=0,l= arr.length-1;
        while (s<=l) {
            int mid = s + (l - s) / 2;

            if (find < arr[mid]) {
                l = mid - 1;
            } else if (find > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }

    return -1;
}}
