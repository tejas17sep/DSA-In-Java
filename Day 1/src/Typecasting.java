import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  float num = input.nextFloat();
       // System.out.println(num);

        // Typecasting
        int num = (int)(56.66f);
        System.out.println(num);
        // Automatic Type Casting
        int a = 277;
        byte b = (byte) (a);
        System.out.println(b);

        int X = 'A';
        System.out.println(X);

        System.out.println("नमस्ते");

        if (true){
            System.out.println("नमस्ते Tejas");
        }

        int count =  1;
        while (count!=5){
            System.out.println(count + "नमस्ते");
            count++;
        }

    }
}
