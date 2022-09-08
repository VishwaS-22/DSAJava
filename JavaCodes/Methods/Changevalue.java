package vishwa;
import java.util.*;
public class Changevalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        change(arr); //this will change the arr.
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] n){
        n[0] = 99;//index 0 is updated with 99.
    }
}
