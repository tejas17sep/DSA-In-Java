import java.util.Scanner;

public class FIbonacci_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the series : ");
        int n=in.nextInt();
        int a=0;
        int b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        for(int i = 1;i<=n;i++){

                int sum = a+b;
                System.out.print(sum + " ");
                a=b;
                b=sum;
            }

        }

    }

