import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
      int ans =  sum2();
      System.out.println(ans);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First No : ");
        int a = in.nextInt();
        System.out.print("Enter the Second No : ");
        int b = in.nextInt();
        int sum = a+b;
        return sum;

    }
}
