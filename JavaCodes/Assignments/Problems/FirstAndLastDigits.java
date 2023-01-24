package vishwa;
import java.util.*;
public class FirstAndLastDigits
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            for(int i=0;i<x;i++)
            {
                if(arr[i]!=arr[n-x+i])
                {
                    System.out.println("no");
                    System.exit(0);
                }
            }
            System.out.println("yes");

    }
}
