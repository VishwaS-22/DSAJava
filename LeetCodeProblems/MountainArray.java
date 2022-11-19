package vishwa;
import java.util.*;
public class MountainArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int[] arr = new int[s];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(PeakIndexInMountainArray(arr));

    }
    static int PeakIndexInMountainArray(int[] arr1){
        int s=0;
        int e=arr1.length-1;
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(arr1[m]>arr1[m+1])
            {
                //Descending Part of the array.
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s; // or e because finally it lies in the same position that is max value.
    }

}
