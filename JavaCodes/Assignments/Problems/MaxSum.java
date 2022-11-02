// Maximum sum of Lower left triangle matrix.

package vishwa;

import java.util.*;
public class MaxSum
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=r;
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int sum1=0,sum2=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=in.nextInt();
                if(j<=i)
                    sum1+=arr1[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=in.nextInt();
                if(j<=i)
                    sum2+=arr2[i][j];
            }
        }
        int s1=sum1;
        int s2=sum2;
        for(int i=0;i<r;i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (s1 >= s2)
                    System.out.print(arr1[i][j]);
                else
                    System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}
