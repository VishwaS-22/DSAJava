package vishwa;

import java.util.*;
public class SumOfLastTwo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if((i%10+i/10%10)%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}