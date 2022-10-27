package vishwa;

import java.util.Scanner;

public class EvenOddDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[10000];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            
        }
        int o=0,e=0;
        for(int i=1;i<=n;i+=2)
        {
            o+=1;
            
        }
        for(int i=0;i<n;i+=2)
        {
            e+=1;
        }
        if(e>o)
        {
            System.out.print("even");
        }
        else if(o>e)
        {
            System.out.print("odd");
        }
        else
        {
            System.out.print(-1);
        }

    }
}
