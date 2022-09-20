package vishwa;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr1={1,11,2,22,3,33,4,44};
        int targetelement=22; //it is at 3rd index
        int ans=linearsearch(arr1,targetelement);
        System.out.println(ans);

    }
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop to check throughout the arr.
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(target == element){
                return i; // it prints the index val of target elemnt.
            }
        }
        // if element not found in the arr, it return -1.
        return -1;
    }
}
