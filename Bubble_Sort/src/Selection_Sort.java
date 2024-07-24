import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection (int arr[]){
        for (int i = 0; i<arr.length;i++){
            int last = arr.length - 1 - i;
            int max_Index = findmax(0,last,arr);
            swap(arr,max_Index,last);
        }
    }
    static int swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max]= arr[last];
        arr[last]=temp;
        return 0;
    }
    static int findmax(int start, int end, int[] arr){
        int max = start;
        for(int i=start;i<=end;i++){

            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
