//Unit Matrix Count
/* 
It is nothing but having 2x2 matix as element '1' (all 4) in a matrix.
*/
package vishwa;

import java.util.*;
class UnitMatrix
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] mat=new int[n][n];
        int row,col;
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                mat[row][col]=in.nextInt();
            }
        }
        int ctc=0;
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                if((mat[row][col]==1 && mat[row][col+1]==1) && (mat[row+1][col]==1 && mat[row+1][col+1]==1))
                {
                    ctc++;
                }
            }
        }
        System.out.println(ctc);
    }
}