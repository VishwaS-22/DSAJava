package vishwa;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i]=in.nextInt(),i++);
        int k=0;
        //int ans = remdup(arr,n);
        for(int i = 1; i<n; i++)
        {
            if(arr[k]!=arr[i]){
                arr[k+1]=arr[i];
                System.out.println(arr[k]);
                k++;
            }
        }
        System.out.println(k+1);
    }
    /* static int remdup(int[] arr1,int n1){
        int k1=0;
        for(int i = 1; i<n1; i++)
        {
            if(arr1[k1]!=arr1[i]){
                arr1[k1+1]=arr1[i];
                System.out.println();
                k1++;
            }
        }
        return k1+1;
    }

    */
}
