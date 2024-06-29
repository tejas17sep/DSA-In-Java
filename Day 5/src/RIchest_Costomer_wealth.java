import java.util.Scanner;

public class RIchest_Costomer_wealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of 2D Array : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the values for Array : ");
        int arr[][] = new int[a][b];
        for (int x=0;x<a;x++){
            for(int y=0;y<b;y++){
                System.out.print("Enter the Number : ");
                arr[x][y]=in.nextInt();
            }
        }
//        int arr[][] = {{1,2,3},{4,5,6}};
        int ans=0;
        for (int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=0;j<arr[i].length;j++){
                    sum+=arr[i][j];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        System.out.print("Max Wealth of customer is : " + ans);
    }
}
