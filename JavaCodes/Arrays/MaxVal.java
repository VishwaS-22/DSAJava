package vishwa;

import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        //int[] arr={11,22,33,44,55};
        Scanner in = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        return m;
    }

}
