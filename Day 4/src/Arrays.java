import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntex
        // datatype[] Variable_Name =  new datatype[Size];

        int[] Roll = new int[6];

        for (int i = 0; i<Roll.length; i++){
            System.out.print("Enter the Number : ");
            Roll[i] = in.nextInt();
        }

       // System.out.println(java.util.Arrays.toString(Roll));

        // Second Method
//        for (int j = 0; j<Roll.length; j++){
//            System.out.print(Roll[j]);

        for(int num : Roll){
            System.out.print(num + " ");
    }
}}
