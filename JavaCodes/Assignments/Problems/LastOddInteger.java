//Print From Last Odd Integer.

package vishwa;
import java.util.*;
public class LastOddInteger
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0;
        int arr[] = new int[t];
        for (int i = 0; i < t; i++)
        {
            arr[i] = in.nextInt();
            if (arr[i] % 2 == 1)
            {
                a = i;
            }
        }
        for (int i = a; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}