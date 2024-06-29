import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length of Array : ");
        int len;
        len = in.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter the Number : ");
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to search in array : ");
        int num = in.nextInt();
        boolean result = true;
        int count = 0;
        for (int j=0;j<arr.length;j++){
            if (arr[j] == num){
                count++;
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
