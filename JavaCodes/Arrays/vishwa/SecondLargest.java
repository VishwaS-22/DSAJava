package vishwa;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i]=in.nextInt(),i++);
        System.out.println(sL(arr,n));
        /*
        int l=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
            }
        }
        int sl=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>sl && arr[i]<l){
                sl=arr[i];
            }
        }
        System.out.println(sl);
        */
    }
        // Optimal Sol.
        static int sL(int[] arr,int n){
            int l=arr[0];
            int sl=-1;
            for(int i=1;i<n;i++){
                if(arr[i]>l){
                    sl=l;
                    l=arr[i];
                }
                else if (arr[i]<l && arr[i]>sl){
                    sl=arr[i];
                }
            }
            return sl;
        }
}
