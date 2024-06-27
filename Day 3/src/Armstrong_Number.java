import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to check weather it is Armstrong or not : ");
        int num = in.nextInt();
        int temp = num;
        int ans = 0;

        while (temp>0){
            int val = temp%10;
            ans = ans + (val*val*val);
            temp = temp / 10;
        }

        if (ans==num){
            System.out.println("It is a Armstrong No");
        }
        else {
            System.out.println("It is not a Armstrong No");
        }

    }
}
