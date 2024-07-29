import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else {
                i++;
            }
        }
    }
}
