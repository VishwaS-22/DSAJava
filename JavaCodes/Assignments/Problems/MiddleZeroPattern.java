package vishwa;
import java.util.*;
public class MiddleZeroPattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i || j==n)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
    }
}
