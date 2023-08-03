package vishwa;
import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i]=ip.nextInt(),i++);
        int l=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        System.out.println(l);
    }
}
