package vishwa;
import java.util.*;
public class FindElementPosition
{
    public static void main(String[] args)
    {
        int[] ar = {1,3,5,7,9,11,13,15,17,19,21};
        int tar=11;
        System.out.println(res(ar,tar));
    }
    static int res(int[] arr,int target)
    {
        int s=0;
        int e=1;
        if(target>e){
            int nS=e+1;
            e+=(e-s+1)*2;
            s=nS;
        }
        return bS(arr,target,s,e);
    }
    static int bS(int arr1[],int target1,int s1,int e1)
    {
        while(s1<=e1)
        {
            int m = s1 + (e1 - s1) / 2;
            if (target1 > arr1[m])
            {
                s1 = m + 1;
            }
            else if (target1 < arr1[m])
            {
                e1 = m - 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
}
