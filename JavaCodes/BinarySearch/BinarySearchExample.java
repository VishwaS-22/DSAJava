package vishwa;

public class BinarySearchExample
{
    public static void main(String[] args)
    {
        int[] arr1={-19,-10,-3,0,1,3,5,7,9,11}; //sorted array.
        int searchElement=11;
        int res=binarySearch(arr1,searchElement);
        System.out.print(res);
    }
    //func to return index of the target element.
    static int binarySearch(int arr[],int target)
    {
        int start = 0;

        int end = arr.length - 1;


        while (start <= end)
        {
            //int mid = (start + end)/ 2;//might be possible that it exceeds the range of int so we can use alter.
            int mid=start+(end-start)/2; //same
            if (target <arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {

                return mid;
            }
        }

        return -1;
    }
}
