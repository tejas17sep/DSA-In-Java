public class All_3_digit_Armstrong_No {
    public static void main(String[] args) {

        for (int i = 100; i<= 1000; i++){
            isArmstrong(i);
        }}

        static void isArmstrong(int num){
        int temp = num;
        int ans = 0;

        while (temp>0){
            int val = temp%10;
            ans = ans + (val*val*val);
            temp = temp / 10;
        }

        if (ans==num){
            System.out.println(num);
        }

}}
