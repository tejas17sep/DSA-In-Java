public class Shadowing {
    static int a = 99;
    public static void main(String[] args) {

        System.out.println(a);

        int a;
        // System.out.println(a); // Error because the value is not initialized or declared
        a = 77;
        System.out.println(a);  //77

        fun();

    }
    static void fun(){
        System.out.println(a);    //99
    }
}
