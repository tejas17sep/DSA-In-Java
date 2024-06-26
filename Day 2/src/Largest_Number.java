import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        // Largest no in 3 Input No.
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
