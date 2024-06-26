import java.util.Scanner;

public class Reverse_No {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number you want to Reverse : ");
        int num = in.nextInt();
        int rev = 0;
        while(num>0){
            int temp = num%10;
            rev=rev*10+temp;
            num = num/10;

        }
        System.out.println("Reversed Number : " + rev);
    }
}
