//String Matrix with C column.

package vishwa;
import java.util.*;
public class StringMatrix
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // given string
        int n = in.nextInt(); //given number
        int l = str.length();
        int c=0; //count
        for(int i=1;i<=1;i++)
        {
            for(int j=0;j<l;j++)
            {
                System.out.print(str.charAt(j));
                c+=1;
                if(c==n)
                {
                    c=0;
                    System.out.println();
                }
                continue;
            }
        }
        int s,k;
        s = l%n; // reminder
        k = n-s; // balance space

        for(int i=1;i<=k;i++)
        {
            System.out.print("*");
        }
    }

}
