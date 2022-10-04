//Sum of left side elements.

import java.util.*;
class leftSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr=new int[n];
        int i,j,s;
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=0;
            for(j=0;j<i;j++)
            {
                s+=arr[j];
            }
            System.out.print(s+" ");
        }
    }
}