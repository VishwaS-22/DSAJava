package vishwa;

import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //Syntax is datatype[] varname = new datatype[];

        //For Primitives
        /*
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }

        //3ways to print.
        System.out.println(Arrays.toString(arr));
        */

        //here j is reference var, tht points to every elements in an arr.
        //for (int j : arr) System.out.print(j + " ");

        /*
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        */
        //For Objects

        String[] arr1=new String[4];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.next();
        }
        System.out.println(Arrays.toString(arr1));
        //modify
        arr1[1]="skv";
        System.out.println(Arrays.toString(arr1));


    }
}
