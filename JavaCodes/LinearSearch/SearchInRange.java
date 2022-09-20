package vishwa;
import java.util.*;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int[] arr1={1,2,3,4,5,6,7};
        int target1=4;
        System.out.println(range(arr1,target1,1,4));
    }
    static boolean range(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
