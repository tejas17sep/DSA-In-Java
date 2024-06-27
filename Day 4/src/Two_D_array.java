import java.util.Arrays;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        1 2 3
//        4 5 6
//        7 8 9
        //Input
        int[][] arr = new int[3][3];
        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter the Number : ");
                for (int j = 0; j<arr[i].length; j++){
                    arr[i][j] = in.nextInt();
                }}
        //Output
        for (int i = 0; i<arr.length; i++){
            {
                System.out.println(Arrays.toString(arr[i]));
            }}

    }
}
