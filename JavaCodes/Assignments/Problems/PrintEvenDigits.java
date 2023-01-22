package vishwa;
import java.util.*;
public class PrintEvenDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),x;
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            x=arr[i];
            while(arr[i]>0)
            {
                int r = arr[i] % 10;
                if(r%2==0)
                {
                    arr[i]/=10;
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(arr[i]==0)
            {
                System.out.print(x+" ");
            }
        }
    }
}
