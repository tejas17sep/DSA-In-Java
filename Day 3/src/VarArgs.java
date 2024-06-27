import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        heat(1,2,3,4,4,6,7,8,9,85);
    }
    static void heat(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
