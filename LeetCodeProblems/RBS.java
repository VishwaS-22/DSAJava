package vishwa;

public class RBS {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.print(findPivot(arr));
    }
    static int search(int[] nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            return bS(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return bS(nums,target,0,pivot-1);
        }
        return bS(nums,target,pivot+1, nums.length);
    }

    static int bS(int[] arr2,int target,int s1,int e1){
        while (s1 <= e1)
        {
            int mid=s1+(e1-s1)/2;
            if (target <arr2[mid])
            {
                e1 = mid - 1;
            }
            else if (target > arr2[mid])
            {
                s1 = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1])
            {
                return mid-1;
            }
            if (arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}
