package vishwa;
import java.util.*;
public class PrintTable
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
