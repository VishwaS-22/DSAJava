/*
BinaryPattern:
Input: 3
Output: 111
        00
        1
*/

package vishwa;
import java.util.*;
public class BinaryPattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                if(i%2==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println("\n");
        }
    }
}
