import java.util.Scanner;

public class Searching_in_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two D array length  :");
        int a = in.nextInt();
        int b = in.nextInt();
        int arr[][] = new  int[a][b];
        for (int x=0;x<a;x++){
            for (int y=0;y<b;y++){
                System.out.print("Enter the values for Array : ");
                arr[x][y]=in.nextInt();
            }
        }
        System.out.print("Enter the values to Search in  Array : ");
        int val=in.nextInt();
//        Searching
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==val){
                    count++;
                }
            }
        }
        if (count==1){
            System.out.println("The Number is present in Array.");
        } else if (count>1) {
            System.out.println("The Number is present "+ count +" in Array.");
        }
        else {
            System.out.println("The Number is not Available in Array.");
        }
    }
}
