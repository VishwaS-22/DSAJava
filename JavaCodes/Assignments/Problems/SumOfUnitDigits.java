package vishwa;
import java.util.*;
public class SumOfUnitDigits
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int s=0;
        for(int i=0;i<=n;i++)
        {
            if(i%10==d)
            {
                s+=i;
            }
        }
        if(s>0)
        {
            System.out.print(s);
        }
        else {
            System.out.println(-1);
        }
    }
}
