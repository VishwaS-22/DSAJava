package vishwa;

public class Floor {
    public static void main(String[] args)
    {
        int[] arr1={2,3,4,9,14,16,18}; //sorted array.
        int searchElement=14;
        int res=floorFunc(arr1,searchElement);
        System.out.print(res);
    }
    //func to return index of the greatest number that is smaller than target.
    static int floorFunc(int arr[],int target) {
        int start = 0;

        int end = arr.length - 1;

        if(target>arr[arr.length-1]){
            return -1;
        }


        while (start <= end) {
            //int mid = (start + end)/ 2;//might be possible that it exceeds the range of int, so we can use alter.
            int mid = start + (end - start) / 2; //same
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
