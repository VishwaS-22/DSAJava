//Print the largest value between the first,middle,last integer of array.
package vishwa;
import java.util.*;
public class LargestOfArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mat=new int[n];
        for(int i=0;i<n;i++)
        {
            mat[i]=in.nextInt();
        }
        int max = mat[0];
        if(max <= mat[mat.length-1])
        {
            max = mat[mat.length - 1];
        }
        if(max <= mat[mat.length/2])
        {
            max = mat[mat.length / 2];
        }
        System.out.println("Largest element between first, last, and middle values: "+max);
    }
}
