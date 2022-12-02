//Printing Frames(*) for a matrix.
package vishwa;
import java.util.*;
public class FramePattern
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
        for(int i=-1;i<=n;i++)
        {
            for(int j=-1;j<=m;j++)
            {
                if(i==-1 || j==-1 || i==n || j==m)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
