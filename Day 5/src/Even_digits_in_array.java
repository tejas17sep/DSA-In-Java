import java.util.Scanner;
public class Even_digits_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Length of Array : ");
        int len;
        len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Number : ");
            arr[i] = in.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                break;
            } else if (arr[i]>0){
                int temp = arr[i];
                count=0;
                while(temp>0){
//                    System.out.println(temp);
                    temp=temp/10;
                    count++;
                }
                if (count%2==0){
                    System.out.print(arr[i] + " ");
                }
//                System.out.println(count);

            }
        }
    }}