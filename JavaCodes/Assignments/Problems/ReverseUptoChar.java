// Reversing till a char in String.

package vishwa;
import java.util.*;
public class ReverseUptoChar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        char v=in.next().charAt(0);
        int i=str.indexOf(v);
        if(i==-1)
        {
            System.out.println(-1);
            return;
        }
        else
        {
            for(int j=i;j>=0;j--)
                System.out.print(str.charAt(j));
        }
    }
}
