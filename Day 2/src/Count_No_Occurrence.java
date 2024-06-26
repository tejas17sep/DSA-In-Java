import java.util.Scanner;

public class Count_No_Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Inputting the Number
        System.out.print("Enter the Number : ");
        int num = in.nextInt();
        System.out.print("Enter the Number to Check : ");
        int n = in.nextInt();

        //Logic Part
        int count=0;
        for(int i = 1; num>0;i++){
            int rem=num%10;
            num=num/10;

            if(n==rem){
                count++;
            }
        }
        System.out.println(n + " Occurrences " + count + " times");

    }
}
