import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {23, 32, 45, 56, 67, 85, 96, 100, 125, 365};
        int find = 100;
        int l = arr.length - 1;
        int s = 0;
        while (l >= s) {
            int mid = s + (s - l) / 2;

            if (find < arr[mid]) {
                l = mid - 1;
            } else if (find > arr[mid]) {
                s = mid + 1;
            } else if (find==mid){
                System.out.print("No is at : " + mid);
            }
            else {
                System.out.println("Number not found");
            }
        }
    }}
