import java.util.Scanner;
public class Search_in_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter the String : ");
        String str = "Tejas";
//        str = in.next();
        char find = 'x';
//        System.out.print("Enter the element to search in String : ");

        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == find) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("The character is present in String.");
        } else if (count > 1) {
            System.out.println("The character is present " + " in String.");
        }
        else {
            System.out.println("The character is Not present in String.");
        }

        }
    }}