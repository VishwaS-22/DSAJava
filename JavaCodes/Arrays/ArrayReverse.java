package vishwa;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[]) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int arr1[],int ind1,int ind2) {

        int t=arr1[ind1];
        arr1[ind1]=arr1[ind2];
        arr1[ind2]=t;
    }

}
