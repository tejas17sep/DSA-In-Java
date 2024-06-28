import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        //Input
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++ ){
            System.out.print("Enter the Numbers : ");
            arr[i] = in.nextInt();
        }
        for (int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
