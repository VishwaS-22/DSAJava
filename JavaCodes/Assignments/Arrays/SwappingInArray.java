package vishwa;
import java.util.*;
public class SwappingInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        //int[] arr={1,2,3,4,5,6};

        swap(arr,x,y);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr1[],int ind1,int ind2) {

        int t=arr1[ind1];
        arr1[ind1]=arr1[ind2];
        arr1[ind2]=t;
    }
}
