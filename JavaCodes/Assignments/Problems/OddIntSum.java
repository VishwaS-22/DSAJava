package vishwa;
import java.util.*;
public class OddIntArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int c=0,s=0;
        for(int i=0;i<n;i++){
            int v=arr[i];
            while(v>0) {
                int r = v % 10;
                v /= 10;
                c += 1;
                if (v == 0 && c % 2 != 0) {
                    arr1[s++] = arr[i];
                    c=0;
                }
                if(v==0 && c%2==0){
                    c=0;
                }
            }
        }
        int s1=0;
        for(int i=0;i<s;i++){
            s1+=arr1[i];
        }
        System.out.print(s1+ " ");
    }
}
