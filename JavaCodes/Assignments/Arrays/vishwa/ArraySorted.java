package vishwa;
import java.util.*;
public class ArraySorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int c=0;
        for(int i=0;i<n;arr[i]=in.nextInt(),i++);
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                c++;
            }else{
                c=0;
            }
        }
        if(c>0)
        System.out.println("Sorted");
        else System.out.println("Not");
    }
}
