package vishwa;
import java.util.*;
public class PassingInfunctions {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        modify(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void modify(int[] arr){
        arr[1]=999;
    }
}
