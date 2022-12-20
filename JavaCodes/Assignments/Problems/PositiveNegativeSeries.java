// Print Positive Negative Series.
// Like 1 -1 2 -2 3 -3 4 -4 5 -5 6 -6 . . . .
package vishwa;
import java.util.*;
public class PositiveNegativeSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)sum+=i;
            else sum-=i;
        }
        System.out.print(sum);
    }
}
