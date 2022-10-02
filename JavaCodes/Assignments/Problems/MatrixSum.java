//Matrix Non-Border sum.

import java.util.*;
class MatrixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int[][] mat=new int[row][col];
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=in.nextInt();
                if((i>0 && i<row-1) && (j>0 &&j<col-1))
                sum+=mat[i][j];
            }
        }
        System.out.print(sum);
    }
}
