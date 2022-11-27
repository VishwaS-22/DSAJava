//N Terms - Fraction Series
package vishwa;
import java.util.*;
public class FractionSeries
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                System.out.print(i+"/4 ");
            }
            else
            {
                if (i % 4 == 0)
                {
                    System.out.print(i/4+" ");
                }
                else
                {
                    System.out.print(i/2+"/2 ");
                }
            }
        }
    }
}
