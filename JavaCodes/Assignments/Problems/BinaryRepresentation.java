//Printing Binary Representation of Square values till n.
package vishwa;
import java.util.*;
public class BinaryRepresentation
{
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            String bs = Integer.toBinaryString(i*i);
            System.out.println(bs+" ");
        }
    }
}
