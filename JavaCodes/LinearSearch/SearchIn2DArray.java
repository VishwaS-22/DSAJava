package vishwa;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,3,4,5},
                {11,12,13},
                {14,15,16,17},
                {0,10,20,30,40}
        };
        int target1=40;
        int[] ans=search(arr,target1);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr1,int target){
        for(int r=0;r<arr1.length;r++){
            for(int c=0;c<arr1[r].length;c++){
                if(arr1[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
