import java.util.Arrays;
import java.util.Scanner;

public class Max_Value_of_Array {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
        //Input
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++ ){
            System.out.print("Enter the Numbers : ");
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for(int j=0; j<arr.length; j++){
              if(arr[j]>max){
                  max = arr[j];
              }
        }
        System.out.println("The Max Number is : " + max);

    }
}
