import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to check weather it is prime or not : ");
        int num = in.nextInt();
        int count = 0;
        int i=1;
        while(i<=num){
            if (num%i==0){
                count++;
            }
            i++;
        }
        if (count == 2){
            System.out.println("It is a Prime Number");
        }
        else {
            System.out.println("It is not a Prime Number");
        }
    }
}
