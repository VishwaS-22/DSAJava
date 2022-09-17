package vishwa;
import java.util.*;
public class MultidimensionalArray {
    public static <arr1> void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        syntax for 2d array:
        int[][] arr=new int[3][3];
        */



        //int[][] arr1=new int[3][4];
        //System.out.println(arr1.length); //it prints the no of the row.

        int[][] arr=new int[3][2];

        for(int r = 0; r <arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
            }
        }
        /*
        for(int r = 0; r <arr.length; r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        */

        /*
        //Another way to print.
        for(int r = 0; r <arr.length; r++){
            System.out.println(Arrays.toString(arr[r]));
        }
        */

        //Enhanced forloop.
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }



    }
}
