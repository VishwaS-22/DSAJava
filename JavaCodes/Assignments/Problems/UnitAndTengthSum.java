//Sum of all unit and tength digits in given numbers.
package vishwa;
import java.util.*;
public class UnitAndTengthSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int n1,s=0,s1=0;
        for(int i=0;i<n;i++)
        {
            n1=in.nextInt();
            s+=n1%10;
            s1+=n1/10%10;
        }
        System.out.println(s+" "+s1);
    }
}
