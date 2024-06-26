import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        boolean value = true;
        while (value){
            System.out.println();
            System.out.println("Enter X or x if you want to close. ");
        System.out.print("Enter the task you want to perform + , - , * , / , %  : ");

        char n = in.next().trim().charAt(0);
        if (n == '+'){
            System.out.print("Enter the First Number : ");
            int a = in.nextInt();
            System.out.print("Enter the Second Number : ");
            int b = in.nextInt();
            result = a+b;
            System.out.print("the ans is : " + result);
        } else if (n=='-') {
            System.out.print("Enter the First Number : ");
            int a = in.nextInt();
            System.out.print("Enter the Second Number : ");
            int b = in.nextInt();
            result = a-b;
            System.out.print("the ans is : " + result);
        }
        else if (n=='*') {
            System.out.print("Enter the First Number : ");
            int a = in.nextInt();
            System.out.print("Enter the Second Number : ");
            int b = in.nextInt();
            result = a*b;
            System.out.print("the ans is : " + result);
        }
        else if (n=='/') {
            System.out.print("Enter the First Number : ");
            int a = in.nextInt();
            System.out.print("Enter the Second Number : ");
            int b = in.nextInt();
            result = a/b;
            System.out.print("the ans is : " + result);
        }
        else if (n=='%') {
            System.out.print("Enter the First Number : ");
            int a = in.nextInt();
            System.out.print("Enter the Second Number : ");
            int b = in.nextInt();
            result = a%b;
            System.out.print("the ans is : " + result);
        }
        else if (n == 'x' || n == 'X') {
            value = false;
        }
        else {
            System.out.println("Entered Input is Invalid");
        }


        }
}}
