//Sum of all the elements in the right triangle of a nxn matrix
package vishwa;
import java.util.*;
public class SumOfRightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] mat=new int[n][n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
                if(i+j>=n-1)
                {
                    s+=mat[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
